package com.integration.general.usecases.location;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("LocationDao")
public class LocationDaoImpl implements LocationDao{

    @Autowired
    SessionFactory sessionFactory;
    @Override
    public List<LocationPojo> findByPlant(String plant) {
        Session session = sessionFactory.openSession();
        List<LocationPojo> list = new ArrayList<>();

        try {
            String sql = "SELECT DISTINCT LOC FROM " + plant + "_LOCMST WHERE PLANT = :plant";
            List<String> rows = session.createSQLQuery(sql)
                    .setParameter("plant", plant)
                    .list();

            for(String loc : rows) {
                list.add(() -> loc);
            }
        }

        catch (Exception e) {
            throw new RuntimeException("Error fetching location by plant", e);
        }
        finally {
            session.close();
        }
        return list;
    }

    @Override
    public List<LocationPojo> findByUserId(String plant, String userId) {
        Session session = sessionFactory.openSession();
        List<LocationPojo> list = new ArrayList<>();

        try {
            String sql = "SELECT DISTINCT LOC FROM " + plant + "_USERLOCATION WHERE USERID = :userId";
            List<String> rows = session.createSQLQuery(sql)
                    .setParameter("userId", userId)
                    .list();

            for(String loc : rows) {
                list.add(() -> loc);
            }
        }
        catch (Exception e) {
            throw new RuntimeException("Error fetching location by user id", e);
        }
        finally {
            session.close();
        }
        return list;
    }

    @Override
    public List<String> findByPlantLoc(String plant) {
        Session session = sessionFactory.openSession();
        List<String> list;

        try {
            String sql = "SELECT DISTINCT LOC FROM " + plant + "_LOCMST where PLANT = :plant";
            Query query = session.createSQLQuery(sql)
                    .setParameter("plant", plant);

            list = query.list();
        }
        catch (Exception e) {
            throw new RuntimeException("Error fetching location by plant", e);
        }
        finally {
            session.close();
        }
        return list;
    }

    @Override
    public List<String> findByUserIdLoc(String plant, String userId) {
        Session session = sessionFactory.openSession();
        List<String> list;

        try {
            String sql = "SELECT DISTINCT LOC FROM " + plant + "_USERLOCATION where USERID = :userId";
            Query query = session.createSQLQuery(sql)
                    .setParameter("userId", userId);

            list = query.list();
        }

        catch (Exception e) {
            throw new RuntimeException("Error fetching location by user Id", e);
        }
        finally {
            session.close();
        }
        return list;
    }
}
