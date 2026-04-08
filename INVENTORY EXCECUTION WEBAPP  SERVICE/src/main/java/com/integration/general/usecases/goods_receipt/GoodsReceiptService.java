package com.integration.general.usecases.goods_receipt;

import com.integration.general.persistence.models.RecvDet;
import com.integration.general.usecases.goods_receipt.goodsReceiptDao.GoodsReceiptDao;
import com.integration.general.usecases.goods_receipt.goodsReceiptSummary.goodsReceiptPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GoodsReceiptService {
    @Autowired
    GoodsReceiptDao goodsReceiptDao;

    public String setRecvDetDetails(String plant, RecvDet val) throws Exception {
        try {
            goodsReceiptDao.save(plant, val);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return "1";
    }

    public List<RecvDet> getgrNoPk(String plant,String grNo) throws Exception {
        List<RecvDet> getVal;
        try {
            getVal = goodsReceiptDao.findByGrNo(plant, grNo);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return getVal;
    }

    public List<RecvDet> getAllpoNoPk(String plant,String poNo) throws Exception {
        List<RecvDet> getVal;
        try {
            getVal = goodsReceiptDao.findBypoNo(plant, poNo);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return getVal;
    }

    public String getAllRecvdetOrderbypono(String plant,String pono,String grno) throws Exception {
        String unitcost="";
        try {
            unitcost = goodsReceiptDao.findByPoNoOrderByItem(plant,pono,grno);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return unitcost;
    }

    public String getAllRecvdetqtybypono(String plant, String poNo,String grNo) throws Exception {
        String qty="";
        try {
            qty = goodsReceiptDao.findByPoNoOrderByQty(plant,poNo,grNo);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return qty;
    }


    public String getTotalAmountBypono(String plant, String poNo) throws Exception {
        String unitcost="";
        try {
            unitcost = goodsReceiptDao.findByPoNoAmount(plant, poNo);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return unitcost;
    }

    public List<RecvDet> getAllRecvDetPkandItem(String plant, String poNo,String item,int lnNo) throws Exception {
        List<RecvDet> getVal;
        try {
            getVal = goodsReceiptDao.findByPoNoAndItem(plant, poNo,item,lnNo);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return getVal;
    }

    public List<goodsReceiptPojo> getGrnoSummary(String grNo, String plant) throws Exception {
        List<goodsReceiptPojo> getVal = new ArrayList<goodsReceiptPojo>();
        try {
            getVal=goodsReceiptDao.getGrnoSummaryFilter(grNo,plant);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return getVal;
    }

}
