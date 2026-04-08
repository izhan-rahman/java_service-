package com.integration.general.usecases.inventory;

import com.integration.general.helpers.configs.LoggerConfig;
import com.integration.general.persistence.models.InvMst;
import com.integration.general.usecases.inventory.pojo.InventoryPojo;
import com.integration.general.usecases.inventory.pojo.itemInventoryPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InventoryService {
    @Autowired
    InventoryDao inventoryDao;

    public InvMst findByItemAndLoc(String plant, String itemNo,String loc) throws Exception {
        InvMst invMst = null;
        try {
            invMst = inventoryDao.findByItemAndLoc(plant, itemNo,loc);
        }catch (Exception e){
            throw new Exception(e);
        }
        return invMst;
    }

    public InvMst findByItemAndLoc(String plant, String itemNo,String loc,String batch) throws Exception {
        InvMst invMst = null;
        try {
            invMst = inventoryDao.findByItemAndLocBatch(plant, itemNo,loc, batch);
        }catch (Exception e){
            throw new Exception(e);
        }
        return invMst;
    }

    public String setInvMst(String plant, InvMst val) throws Exception {
        try {
            inventoryDao.save(plant, val);
        } catch (Exception e) {
            LoggerConfig.logger.error(e.getMessage());
            throw new Exception(e.getMessage());
        }
        return "1";
    }

/*    public boolean isExisit(String item,String loc,String batch) throws Exception {
        boolean check = false;
        try {
           check =  inventoryRepository.findByItemLocAndBatch(item,loc,batch);
        } catch (Exception e) {
            LoggerConfig.logger.error(e.getMessage());
            throw new Exception(e.getMessage());
        }
        return check;
    }*/

    public List<InventoryPojo> getLocation(String plant) throws Exception {
        List<InventoryPojo>  inventoryPojo;
        try {
            inventoryPojo = inventoryDao.findByLoc(plant);
        }catch (Exception e){
            throw new Exception(e);
        }
        return inventoryPojo;
    }

    public List<itemInventoryPojo> getInvSummarybyItem(String item, String plant) throws Exception {
        List<itemInventoryPojo> getVal = new ArrayList<itemInventoryPojo>();
        try {
            getVal=inventoryDao.getInvSummaryFilter(item,plant);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return getVal;
    }
}
