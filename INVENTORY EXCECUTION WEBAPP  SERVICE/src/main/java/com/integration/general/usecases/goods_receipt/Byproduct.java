package com.integration.general.usecases.goods_receipt;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Byproduct {
    private String item;
    private float qty;
    /*private String loc;*/
    private String batch;
}
