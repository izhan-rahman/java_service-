package com.integration.general.usecases.inventory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class inventorySummary {
    private String item;
    private String loc;
    private String batch;
    private int qty;
    private String uom;
}
