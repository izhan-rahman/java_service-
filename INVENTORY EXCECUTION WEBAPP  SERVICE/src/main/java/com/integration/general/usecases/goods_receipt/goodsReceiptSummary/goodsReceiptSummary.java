package com.integration.general.usecases.goods_receipt.goodsReceiptSummary;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class goodsReceiptSummary {
    private String pono;
    private String grno;
    private String supplier;
    private String item;
    private String itemdesc;
    private String loc;
    private String batch;
    private int orderqty;
    private int receiveqty;
    private int unitcost;
}
