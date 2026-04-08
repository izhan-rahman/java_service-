package com.integration.general.usecases.goods_receipt.goodsReceiptDao;

import com.integration.general.persistence.models.RecvDet;
import com.integration.general.usecases.goods_receipt.goodsReceiptSummary.goodsReceiptPojo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("GoodsReceiptDao")
public class GoodsReceiptDaoImpl implements GoodsReceiptDao{

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void save(String plant, RecvDet recvDet) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            recvDet.setPlant(plant);
            session.save(recvDet);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            throw new RuntimeException("Error saving RecvDet", e);
        } finally {
            session.close();
        }
    }

    @Override
    public List<RecvDet> findByGrNo(String plant, String grNo) {
        Session session = sessionFactory.openSession();
        List<RecvDet> list;

        try {
            String sql = "SELECT * from " + plant + "_RECVDET where GRNO = :grNo";

            Query query = session.createSQLQuery(sql)
                    .addEntity(RecvDet.class)
                    .setParameter("grNo", grNo);

            list = query.list();
        }

        catch (Exception e) {
            throw new RuntimeException("Error fetching GR details", e);
        }
        finally {
            session.close();
        }
        return list;
        }

    @Override
    public List<RecvDet> findBypoNo(String plant, String poNo) {
        Session session = sessionFactory.openSession();
        List<RecvDet> list;

        try {
            String sql = "SELECT * FROM " + plant + "_RECVDET WHERE PONO = :poNo";
            Query query = session.createSQLQuery(sql)
                    .addEntity(RecvDet.class)
                    .setParameter("poNo", poNo);

            list = query.list();
        }

        catch (Exception e) {
            throw new RuntimeException("Error fetching PO details", e);
        }
        finally {
            session.close();
        }
        return list;
    }

    @Override
    public String findByPoNoOrderByItem(String plant, String poNo, String grNo) {
        Session session = sessionFactory.openSession();

        try {
            String sql = "SELECT SUM(RECQTY*UNITCOST) as amount  FROM " + plant + "_RECVDET " +
                    "WHERE PONO = :poNo AND GRNO = :grNo";

            Object result = session.createSQLQuery(sql)
                    .setParameter("poNo", poNo)
                    .setParameter("grNo", grNo)
                    .uniqueResult();

            return result != null ? result.toString() : null;
        }
        catch (Exception e) {
            throw new RuntimeException("Error calculating total amount for PONO: " + poNo + " and GRNO: " + grNo);
        }
        finally {
            session.close();
        }
    }

    @Override
    public String findByPoNoOrderByQty(String plant, String poNo, String grNo) {
        Session session = sessionFactory.openSession();

        try {
            String sql = "SELECT SUM(RECQTY) as QTY FROM " + plant + "_RECVDET " +
                    "WHERE PONO = :poNo AND GRNO = :grNo";

            Object result = session.createSQLQuery(sql)
                    .setParameter("poNo", poNo)
                    .setParameter("grNo", grNo)
                    .uniqueResult();

            return result != null ? result.toString() : null;
        }
        catch (Exception e) {
            throw new RuntimeException("Error calculating total quantity for PONO: " + poNo + " and GRNO: " + grNo);
        }
        finally {
            session.close();
        }
    }

    @Override
    public String findByPoNoAmount(String plant, String poNo) {
        Session session = sessionFactory.openSession();

        try {
            String sql = "SELECT SUM(UNITCOST*RECQTY) as TOTALAMOUNT FROM " + plant + "_RECVDET " +
                    "WHERE PONO = :poNo";
            Object result = session.createSQLQuery(sql)
                    .setParameter("poNo", poNo)
                    .uniqueResult();

            return result != null ? result.toString() : null;
        }
        catch (Exception e) {
            throw new RuntimeException("Error calculating total amount for PONO: " + poNo);
        }
        finally {
            session.close();
        }
    }

    @Override
    public List<RecvDet> findByPoNoAndItem(String plant, String poNo, String item, int lnNo) {
        Session session = sessionFactory.openSession();
        List<RecvDet> list;

        try {
            String sql = "SELECT * from " + plant + "_RECVDET " +
                    "WHERE PONO = :poNo AND ITEM = :item AND LNNO = :lnNo";

            Query query = session.createSQLQuery(sql)
                    .addEntity(RecvDet.class)
                    .setParameter("poNo", poNo)
                    .setParameter("item", item)
                    .setParameter("lnNo", lnNo);

            list = query.list();
        }

        catch (Exception e) {
            throw new RuntimeException("Error fetching PONo and Item", e);
        }
        finally {
            session.close();
        }
        return list;
    }

    @Override
    public List<goodsReceiptPojo> getGrnoSummaryFilter(String grNo, String plant) {
        Session session = sessionFactory.openSession();
        List<goodsReceiptPojo> list = new ArrayList<>();

        try {
            String sql = "SELECT PONO,GRNO,CNAME as SUPPLIER,ITEM,ITEMDESC,LOC,BATCH," +
                    "ORDQTY as ORDERQTY,RECQTY AS RECEIVEQTY,UNITCOST " +
                    "FROM " + plant + "_RECVDET " +
                    "WHERE GRNO =:grNo AND PLANT =:plant";

            List<Object[]> rows = session.createSQLQuery(sql)
                    .setParameter("grNo", grNo)
                    .setParameter("plant", plant)
                    .list();

            for(Object[] row : rows) {
                list.add(new goodsReceiptPojo() {
                    @Override
                    public String getpono() {return (String) row[0];}

                    @Override
                    public String getgrno() {return (String) row[1];}

                    @Override
                    public String getsupplier() {return (String) row[2];}

                    @Override
                    public String getitem() {return (String) row[3];}

                    @Override
                    public String getitemdesc() {return (String) row[4];}

                    @Override
                    public String getloc() {return (String) row[5];}

                    @Override
                    public String getbatch() {return (String) row[6];}

                    @Override
                    public int getorderqty() {return row[7] != null ? ((Number) row[7]).intValue() : 0;}

                    @Override
                    public int getreceiveqty() {return row[8] != null ? ((Number) row[8]).intValue() : 0;}

                    @Override
                    public int getunitcost() {return row[9] != null ? ((Number) row[9]).intValue() : 0;}
                });
            }
        }

        catch (Exception e) {
            throw new RuntimeException("Error fetching GRNO Summary", e);
        }
        finally {
            session.close();
        }
        return list;
    }

}


