package com.integration.general.persistence.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PurchaseOrderDetail {
    private PoHdr poHdr;
    private List<PoDet> poDet;
    private List<PoDetRemarks> poDetRemarks;
}
