package com.integration.general.usecases.goods_receipt;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GoodsReceiptListbyitem {
    private String loc;
    private List<Byproduct> item;
    /*private String recvqty;*/
    /*private String loc;*/
}
