package com.integration.general.usecases.inventory;

import com.integration.general.persistence.models.InvMst;
import com.integration.general.usecases.inventory.pojo.InventoryPojo;
import com.integration.general.usecases.inventory.pojo.itemInventoryPojo;

import java.util.List;

public interface InventoryDao {
    void save(String plant, InvMst invMst);
    InvMst findByIdAndItemAndLocationAndUserFieldFour(String plant, Integer id, String item, String loc, String userFieldFour);
    double getTQtyByItemLocBatch(String plant, String item,String loc,String userFieldFour);
    List<InvMst> findByItemAndLocationAndUserFieldFour(String plant, String item, String loc, String userFieldFour);
    List<InvMst>  getByItemLocBatch(String plant, String item,String loc, String userFieldFour);
    InvMst findByItemAndLoc(String plant, String item,String loc);
    InvMst findByItemAndLocBatch(String plant, String item,String loc,String batch);
    List<InventoryPojo> findByLoc(String plant);
    InvMst findByItem(String plant, String item);
    List<itemInventoryPojo> getInvSummaryFilter(String item, String plant);
    List<InvMst> findByLocationAndItemAndUserFieldFour(String plant, String loc, String item, String userFieldFour);
}
