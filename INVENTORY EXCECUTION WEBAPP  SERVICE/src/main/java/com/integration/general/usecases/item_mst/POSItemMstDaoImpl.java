package com.integration.general.usecases.item_mst;

import com.integration.general.persistence.models.ItemMst;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("POSItemMstDao")
public class POSItemMstDaoImpl implements POSItemMstDao {
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void save(String plant, ItemMst itemMst) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            itemMst.setPlant(plant);
            session.save(itemMst);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            throw new RuntimeException("Error saving ItemMst", e);
        } finally {
            session.close();
        }
    }

    @Override
    public ItemMst findByItem(String plant, String item) {
        Session session = sessionFactory.openSession();

        try {

            String sql = "SELECT * FROM " + plant + "_ITEMMST WHERE ITEM = :item";

            return (ItemMst) session.createSQLQuery(sql)
                    .addEntity(ItemMst.class)
                    .setParameter("item", item)
                    .uniqueResult();

        } catch (Exception e) {
            throw new RuntimeException("Error fetching item", e);
        } finally {
            session.close();
        }
    }

    @Override
    public String getAvgCostOfItem(String plant, String item) {
        Session session = sessionFactory.openSession();

        try {

            String sql = "SELECT CASE WHEN  (SELECT COUNT(CURRENCYID) FROM " + plant + "_RECVDET R WHERE ITEM = :item AND CURRENCYID IS NOT NULL AND tran_type \n" +
                    "IN('IB','GOODSRECEIPTWITHBATCH','INVENTORYUPLOAD','DE-KITTING','KITTING') )>0 THEN  \n" +
                    "(Select ISNULL(CAST(ISNULL(SUM(CASE WHEN A.TRAN_TYPE='GOODSRECEIPTWITHBATCH' THEN 0 \n" +
                    "ELSE A.UNITCOST END),0)/SUM(VC) AS DECIMAL(20,5)),0) AS AVERGAGE_COST from  \n" +
                    "(select TRAN_TYPE,RECQTY VC,CASE WHEN TRAN_TYPE IN ('INVENTORYUPLOAD','DE-KITTING','KITTING') THEN\n" +
                    "(isnull(R.unitcost*(SELECT CURRENCYUSEQT  FROM " + plant +"_CURRENCYMST WHERE  \n" +
                    "CURRENCYID=ISNULL(P.CURRENCYID,'SGD')),0)*R.RECQTY) ELSE CAST( (CAST(ISNULL(\n" +
                    "ISNULL((select ISNULL(QPUOM,1) from " + plant + "_UOM where UOM=''),1) * ( ISNULL(((isnull(R.unitcost*(SELECT CURRENCYUSEQT  FROM " + plant +"_CURRENCYMST WHERE  \n" +
                    "CURRENCYID=ISNULL(P.CURRENCYID,'SGD')),0)+ ISNULL((SELECT (SUM(E.QTY*LANDED_COST)/SUM(E.QTY)) FROM " + plant + "_RECVDET c left join " + plant + "_FINBILLHDR d on\n" +
                    "c.PONO = d.PONO and c.GRNO = d.GRNO left join " + plant +"_FINBILLDET e on d.ID = e.BILLHDRID where c.pono =R.pono and c.LNNO=R.LNNO and e.ITEM = :item \n" +
                    "OR c.TRAN_TYPE='GOODSRECEIPTWITHBATCH' AND c.item = :item),0) +  (ISNULL(R.unitcost*(SELECT CURRENCYUSEQT  FROM " + plant + "_CURRENCYMST WHERE  \n" +
                    "CURRENCYID=ISNULL(P.CURRENCYID,'SGD')),0) * (((ISNULL(P.LOCALEXPENSES,0)+ CASE WHEN (SELECT SUM(LANDED_COST) FROM " + plant + "_FINBILLHDR c join \n" +
                    plant +"_FINBILLDET d  ON c.ID = d.BILLHDRID and c.PONO = R.PONO and d.LNNO = R.LNNO) is null THEN P.SHIPPINGCOST ELSE 0 END)*100)/NULLIF((ISNULL((select \n" +
                    "SUM(s.qtyor*s.UNITCOST*s.CURRENCYUSEQT) from " + plant + "_podet s where s.pono=R.pono),0)),0))/100))/ (SELECT CURRENCYUSEQT  FROM " + plant + "_CURRENCYMST WHERE \n" +
                    "CURRENCYID=ISNULL(P.CURRENCYID,'SGD'))),0)) ,0) \n" +
                    "*(SELECT CURRENCYUSEQT FROM " + plant +"_CURRENCYMST WHERE  CURRENCYID='SGD')*(SELECT CURRENCYUSEQT  FROM " + plant + "_CURRENCYMST    \n" +
                    "WHERE  CURRENCYID=ISNULL(P.CURRENCYID,'SGD')) AS DECIMAL(20,5)) )  * CAST((SELECT CURRENCYUSEQT  \n" +
                    "FROM " + plant + "_CURRENCYMST WHERE  CURRENCYID='SGD')AS DECIMAL(20,5))  / CAST((SELECT CURRENCYUSEQT \n" +
                    "FROM " + plant +"_CURRENCYMST WHERE  CURRENCYID=ISNULL(P.CURRENCYID,'SGD')) AS DECIMAL(20,5))   \n" +
                    "* RECQTY AS DECIMAL(20,5)) END AS UNITCOST from " + plant + "_RECVDET R LEFT JOIN " + plant + "_POHDR P ON R.PONO = P.PONO \n" +
                    " where item = :item AND ISNULL(R.UNITCOST,0) != 0 AND tran_type IN('IB','GOODSRECEIPTWITHBATCH','INVENTORYUPLOAD','DE-KITTING','KITTING')    ) A)   \n" +
                    " ELSE (SELECT CASE WHEN (SELECT COUNT(*) FROM " + plant +"_RECVDET WHERE ITEM = :item AND tran_type IN('INVENTORYUPLOAD','DE-KITTING','KITTING') )>0\n" +
                    " THEN (SELECT ISNULL(SUM(UNITCOST),0) FROM " + plant + "_RECVDET C where item = :item \n" +
                    " AND ISNULL(C.UNITCOST,0) != 0 AND tran_type IN('INVENTORYUPLOAD','DE-KITTING','KITTING')) ELSE \n" +
                    " CAST(((SELECT M.COST FROM " + plant + "_ITEMMST M WHERE M.ITEM = :item)*(SELECT CURRENCYUSEQT  FROM\n" +
                    plant + "_CURRENCYMST WHERE  CURRENCYID='SGD')) AS DECIMAL(20,5))   END) END  AS AVERAGE_COST";

            Object result = session.createSQLQuery(sql)
                    .setParameter("item", item)
                    .uniqueResult();

            return result != null ? result.toString() : null;

        } catch (Exception e) {
            throw new RuntimeException("Error calculating average cost for item", e);
        } finally {
            session.close();
        }
    }

    @Override
    public int getSalesPriceCodition(String plant, String orderType) {
        Session session = sessionFactory.openSession();
        try {
            String sql = "select TOP 1 ISNULL(SHOWPREVIOUSSALESCOST,0) AS FLAG FROM " + plant + "_OUTBOUND_RECIPT_INVOICE_HDR " +
                    "WHERE PLANT= :plant AND ORDERTYPE= :orderType";
            Object result = session.createSQLQuery(sql)
                    .setParameter("plant", plant)
                    .setParameter("orderType", orderType)
                    .uniqueResult();

            return result != null ? ((Number)result).intValue() : 0;

        } catch (Exception e) {
            throw new RuntimeException("Error fetching sales price", e);
        } finally {
            session.close();
        }
        }

    @Override
    public String getListPriceOfItem(String plant, String item) {
        Session session = sessionFactory.openSession();
        try {
            String sql = "SELECT CASE WHEN INCPRICEUNIT = '%' THEN (UnitPrice + ((UnitPrice/100)*INCPRICE)) " +
                    "ELSE (UnitPrice + INCPRICE) END AS UNITPRICE  " +
                    "FROM " + plant + "_ITEMMST WHERE ITEM= :item";
            Object result = session.createSQLQuery(sql)
                    .setParameter("item", item)
                    .uniqueResult();

            return result != null ? result.toString() : "0";

        } catch (Exception e) {
            throw new RuntimeException("Error fetching list price of item", e);
        } finally {
            session.close();
        }
    }

    @Override
    public String getorderPricOfItem(String plant, String item) {
        Session session = sessionFactory.openSession();
        try {
            String sql = "SELECT UNITPRICE FROM " + plant + "_DODET WHERE ID IN (SELECT MAX(ID) " +
                    "FROM " + plant + "_DODET WHERE ITEM= :item)";
            Object result = session.createSQLQuery(sql)
                    .setParameter("item", item)
                    .uniqueResult();

            return result != null ? result.toString() : "0";

        } catch (Exception e) {
            throw new RuntimeException("Error fetching order price of item", e);
        } finally {
            session.close();
        }
    }

    @Override
    public String getItemPurchaseQpuom(String plant, String item) {
        Session session = sessionFactory.openSession();
        try {
            String sql = "SELECT ISNULL(U.QPUOM,'1') FROM " + plant + "_ITEMMST AS I LEFT JOIN " + plant + "_UOM AS U ON " +
                    "I.PURCHASEUOM = U.UOM WHERE I.ITEM= :item";
            Object result = session.createSQLQuery(sql)
                    .setParameter("item", item)
                    .uniqueResult();

            return result != null ? result.toString() : "0";

        } catch (Exception e) {
            throw new RuntimeException("Error fetching item purchase", e);
        } finally {
            session.close();
        }
    }

    @Override
    public String getItemSalesQpuom(String plant, String item) {
        Session session = sessionFactory.openSession();
        try {
            String sql = "SELECT ISNULL(U.QPUOM,'1') FROM " + plant + "_ITEMMST AS I LEFT JOIN " +plant + "_UOM AS U ON " +
                    "I.SALESUOM = U.UOM WHERE I.ITEM= :item";
            Object result = session.createSQLQuery(sql)
                    .setParameter("item", item)
                    .uniqueResult();

            return result != null ? result.toString() : "0";

        } catch (Exception e) {
            throw new RuntimeException("Error fetching item sales", e);
        } finally {
            session.close();
        }
    }

    @Override
    public Integer getByItemNumber(String plant, String item) {
        Session session = sessionFactory.openSession();
        try {
            String sql = "SELECT ID FROM " + plant + "_ITEMMST WHERE ITEM = :item";
            Object result = session.createSQLQuery(sql)
                    .setParameter("item", item)
                    .uniqueResult();

            return result != null ? ((Number)result).intValue() : null;

        } catch (Exception e) {
            throw new RuntimeException("Error fetching item by item number", e);
        } finally {
            session.close();
        }
    }
}



