package com.integration.general.persistence.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity @Table(name="FINCOUNTRYTAXTYPE")
@Getter
@Setter
public class FinCountryTaxType {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;
    @Column(name="COUNTRY_CODE")
    private String countryCode;
    @Column(name="CONFIGKEY")
    private String configKey;
    @Column(name="TAXTYPE")
    private String taxType;
    @Column(name = "TAXDESC")
    private String taxDesc;
    @Column(name = "SHOWTAX")
    private Integer showTax;
    @Column(name = "SHOWSTATE")
    private Integer showState;
    @Column(name = "ISZERO")
    private Integer isZero;
    @Column(name = "SHOWPERCENTAGE")
    private Integer showPercentage;
    @Column(name = "TAXBOX")
    private Integer taxBox;
    @Column(name="percentagevalue")
    private String percentagevalue;
}
