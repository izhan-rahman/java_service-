package com.integration.general.persistence.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SalesOrderDetail {
    private DoHdr doHdr;
    private List<DoDet> doDet;
    private List<DoDetRemarks> doDetRemarks;
}
