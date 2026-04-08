package com.integration.general.usecases.goods_receipt;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GoodsReceiptList {
    private String poNo;
    private List<PrdItem> item;
    /*private String recvqty;*/
    /*private String loc;*/
}
