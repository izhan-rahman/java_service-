package com.integration.general.usecases.item_mst;

import com.integration.general.persistence.models.ItemMst;

public interface POSItemMstDao {
    void save(String plant, ItemMst itemMst);
    ItemMst findByItem(String plant, String item);
    String getAvgCostOfItem(String plant, String item);
    int getSalesPriceCodition(String plant,String orderType);
    String getListPriceOfItem(String plant, String item);
    String getorderPricOfItem(String plant, String item);
    String getItemPurchaseQpuom(String plant, String item);
    String getItemSalesQpuom(String plant, String item);
    Integer getByItemNumber(String plant, String item);
}
