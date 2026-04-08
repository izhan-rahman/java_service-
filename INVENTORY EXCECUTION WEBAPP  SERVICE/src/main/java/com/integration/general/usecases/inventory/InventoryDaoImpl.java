package com.integration.general.usecases.inventory;

import com.integration.general.persistence.models.InvMst;
import com.integration.general.usecases.inventory.pojo.InventoryPojo;
import com.integration.general.usecases.inventory.pojo.itemInventoryPojo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("InventoryDao")
public class InventoryDaoImpl implements InventoryDao{

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void save(String plant, InvMst invMst) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            invMst.setPlant(plant);
            session.save(invMst);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            throw new RuntimeException("Error saving InvMst", e);
        } finally {
            session.close();
        }
    }
    @Override
    public InvMst findByIdAndItemAndLocationAndUserFieldFour(String plant, Integer id, String item, String loc, String userFieldFour) {
        Session session = sessionFactory.openSession();
        try {

            String sql = "SELECT * FROM " + plant + "_INVMST " +
                    "WHERE ID = :id " +
                    "AND ITEM = :item " +
                    "AND LOC = :loc " +
                    "AND USERFLD4 = :userFieldFour";

            return (InvMst) session.createSQLQuery(sql)
                    .addEntity(InvMst.class)
                    .setParameter("id", id)
                    .setParameter("item", item)
                    .setParameter("loc", loc)
                    .setParameter("userFieldFour", userFieldFour)
                    .uniqueResult();

        } catch (Exception e) {

            throw new RuntimeException("Error fetching inventory data", e);

        } finally {
            session.close();
        }
    }

    @Override
    public double getTQtyByItemLocBatch(String plant, String item, String loc, String userFieldFour) {
        Session session = sessionFactory.openSession();
        try {

            String sql = "SELECT ISNULL(SUM(QTY),0) AS QTY FROM " + plant + "_INVMST " +
                         " WHERE ITEM = :item AND LOC = :loc AND USERFLD4 = :userFieldFour";

            Object result =  session.createSQLQuery(sql)
                    .setParameter("item", item)
                    .setParameter("loc", loc)
                    .setParameter("userFieldFour", userFieldFour)
                    .uniqueResult();

            return result != null ? ((Number)result).doubleValue() : 0.0;

        } catch (Exception e) {

            throw new RuntimeException("Error fetching total qty by item, loc and batch", e);

        } finally {
            session.close();
        }
    }

    @Override
    public List<InvMst> findByItemAndLocationAndUserFieldFour(String plant, String item, String loc, String userFieldFour) {
        Session session = sessionFactory.openSession();
        List<InvMst> list;

        try {
            String sql = "SELECT * FROM " + plant + "_InvMst " +
                    "WHERE ITEM = :item AND LOC = :loc AND USERFLD4 = :userFieldFour ";
            Query query = session.createSQLQuery(sql)
                    .addEntity(InvMst.class)
                    .setParameter("item", item)
                    .setParameter("loc", loc)
                    .setParameter("userFieldFour", userFieldFour);

            list = query.list();
        }

        catch (Exception e) {
            throw new RuntimeException("Error fetching inventory data by item, loc and userFld4", e);
        }
        finally {
            session.close();
        }
        return list;
    }

    @Override
    public List<InvMst> getByItemLocBatch(String plant, String item, String loc, String userFieldFour) {
        Session session = sessionFactory.openSession();
        List<InvMst> list;

        try {
            String sql = "SELECT * FROM " + plant + "_INVMST " +
                    "WHERE ITEM = :item AND LOC = :loc AND USERFLD4 = :userFieldFour " +
                    "ORDER BY SUBSTRING(CONVERT(VARCHAR,CRAT,112),5,4) + '-' + " +
                    "SUBSTRING(CONVERT(VARCHAR,CRAT,112),3,2) + '-' + " +
                    "LEFT(CONVERT(VARCHAR,CRAT,112),2) ASC";
            Query query = session.createSQLQuery(sql)
                    .addEntity(InvMst.class)
                    .setParameter("item", item)
                    .setParameter("loc", loc)
                    .setParameter("userFieldFour", userFieldFour);

            list = query.list();
        }

        catch (Exception e) {
            throw new RuntimeException("Error fetching inventory data by item, loc and batch", e);
        }
        finally {
            session.close();
        }
        return list;
    }

    @Override
    public InvMst findByItemAndLoc(String plant, String item, String loc) {
        Session session = sessionFactory.openSession();
        try {

            String sql = "SELECT * FROM " + plant + "_INVMST " +
                    "where ITEM = :item and loc = :loc" ;

            return (InvMst) session.createSQLQuery(sql)
                    .addEntity(InvMst.class)
                    .setParameter("item", item)
                    .setParameter("loc", loc)
                    .uniqueResult();

        } catch (Exception e) {
            throw new RuntimeException("Error fetching inventory by item and loc", e);

        } finally {
            session.close();
        }
    }

    @Override
    public InvMst findByItemAndLocBatch(String plant, String item, String loc, String batch) {
        Session session = sessionFactory.openSession();
        try {

            String sql = "SELECT * FROM " + plant + "_INVMST " +
                    "where ITEM = :item AND LOC = :loc AND USERFLD4 =:batch" ;

            return (InvMst) session.createSQLQuery(sql)
                    .addEntity(InvMst.class)
                    .setParameter("item", item)
                    .setParameter("loc", loc)
                    .setParameter("batch", batch)
                    .uniqueResult();

        } catch (Exception e) {
            throw new RuntimeException("Error fetching inventory by item, loc and batch", e);

        } finally {
            session.close();
        }
    }

    @Override
    public List<InventoryPojo> findByLoc(String plant) {
        Session session = sessionFactory.openSession();
        List<InventoryPojo> list = new ArrayList<>();

        try {
            String sql = "SELECT DISTINCT LOC AS LOCATION FROM " + plant + "_INVMST WHERE PLANT = :plant";
            List<String> rows = session.createSQLQuery(sql)
                         .setParameter("plant", plant)
                         .list();

           for(String loc : rows) {
               list.add(() -> loc);
           }
        }

        catch (Exception e) {
            throw new RuntimeException("Error fetching inventory by loc", e);
        }
        finally {
            session.close();
        }
        return list;
    }

    @Override
    public InvMst findByItem(String plant, String item) {
        Session session = sessionFactory.openSession();
        try {

            String sql = "SELECT * FROM " + plant + "_INVMST " +
                    "WHERE ITEM = :item";

            return (InvMst) session.createSQLQuery(sql)
                    .addEntity(InvMst.class)
                    .setParameter("item", item)
                    .uniqueResult();

        } catch (Exception e) {
            throw new RuntimeException("Error fetching inventory by item", e);

        } finally {
            session.close();
        }
    }

    @Override
    public List<itemInventoryPojo> getInvSummaryFilter(String item, String plant) {
        Session session = sessionFactory.openSession();
        List<itemInventoryPojo> list = new ArrayList<>();

        try {
            String sql = "SELECT V.ITEM,V.LOC,V.USERFLD4 AS BATCH,V.QTY,I.INVENTORYUOM as UOM " +
                    "FROM " + plant + "_INVMST V RIGHT JOIN " + plant + "_ITEMMST I on V.item=I.item " +
                    "WHERE V.ITEM =:item AND V.PLANT =:plant";
            List<Object[]> rows = session.createSQLQuery(sql)
                    .setParameter("item", item)
                    .setParameter("plant", plant)
                    .list();

            for(Object[] row : rows) {
                String itm = (String) row[0];
                String loc = (String) row[1];
                String batch = (String) row[2];
                int qty = row[3] != null ? ((Number) row[3]).intValue() : 0;
                String uom = (String) row[4];

                list.add(new itemInventoryPojo() {
                    public String getitem() { return itm; }
                    public String getloc() { return loc; }
                    public String getbatch() { return batch; }
                    public int getqty() { return qty; }
                    public String getuom() { return uom; }
                });
            }
        }

        catch (Exception e) {
            throw new RuntimeException("Error fetching inventory summary", e);
        }
        finally {
            session.close();
        }
        return list;
    }

    @Override
    public List<InvMst> findByLocationAndItemAndUserFieldFour(String plant, String loc, String item, String userFieldFour) {
        Session session = sessionFactory.openSession();
        List<InvMst> list;

        try {
            String sql = "SELECT * FROM " + plant + "_INVMST " +
                    "WHERE LOC = :loc AND ITEM = :item AND USERFLD4 = :userFieldFour ";
            Query query = session.createSQLQuery(sql)
                    .addEntity(InvMst.class)
                    .setParameter("loc", loc)
                    .setParameter("item", item)
                    .setParameter("userFieldFour", userFieldFour);

            list = query.list();
        }

        catch (Exception e) {
            throw new RuntimeException("Error fetching inventory data by loc, item and userFld4", e);
        }
        finally {
            session.close();
        }
        return list;
    }
}

