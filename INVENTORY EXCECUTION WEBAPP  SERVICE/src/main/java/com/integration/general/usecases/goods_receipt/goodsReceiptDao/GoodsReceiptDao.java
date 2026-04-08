package com.integration.general.usecases.goods_receipt.goodsReceiptDao;

import com.integration.general.persistence.models.RecvDet;
import com.integration.general.usecases.goods_receipt.goodsReceiptSummary.goodsReceiptPojo;

import java.util.List;

public interface GoodsReceiptDao {
    void save(String plant, RecvDet recvDet);
    List<RecvDet> findByGrNo(String plant, String grNo);
    List<RecvDet> findBypoNo(String plant, String poNo);
    String findByPoNoOrderByItem(String plant, String poNo,String grNo);
    String findByPoNoOrderByQty(String plant, String poNo,String grNo);
    String findByPoNoAmount(String plant, String poNo);
    List<RecvDet> findByPoNoAndItem(String plant, String poNo, String item, int lnNo);
    List<goodsReceiptPojo> getGrnoSummaryFilter(String grno, String plant);
}
