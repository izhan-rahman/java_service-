package com.integration.general.usecases.location;

import java.util.List;

public interface LocationDao {
    List<LocationPojo> findByPlant(String plant);
    List<LocationPojo> findByUserId(String plant, String userId);
    List<String> findByPlantLoc(String plant);
    List<String> findByUserIdLoc(String plant, String userId);

}
