package com.integration.general.usecases.location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {
    @Autowired
    LocationDao locationDao;

    public List<LocationPojo> getAllLocation(String plant) throws Exception {
        List<LocationPojo> locationList;
        try {
            locationList = locationDao.findByPlant(plant);
        } catch (Exception e) {
            throw new Exception(e);
        }
        return locationList;
    }

    public List<LocationPojo> getUserLocation(String plant, String userId) throws Exception {
        List<LocationPojo> locationList;
        try {
            locationList = locationDao.findByUserId(plant, userId);
        } catch (Exception e) {
            throw new Exception(e);
        }
        return locationList;
    }

    public List<String> getAllLoc(String plant) throws Exception {
        List<String> locationList;
        try {
            locationList = locationDao.findByPlantLoc(plant);
        } catch (Exception e) {
            throw new Exception(e);
        }
        return locationList;
    }

    public List<String> getUserAllLoc(String plant,String userId) throws Exception {
        List<String> locationList;
        try {
            locationList = locationDao.findByUserIdLoc(plant, userId);
        } catch (Exception e) {
            throw new Exception(e);
        }
        return locationList;
    }
}
