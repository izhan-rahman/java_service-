package com.integration.general.persistence.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="##plant##FINBILLDET")
@Getter
@Setter
public class FinBillDet {
    @Column(name="PLANT")
    private String plant;
    @Column(name="LNNO")
    private int lnno;
    @Column(name="BILLHDRID")
    private int billHdrId;
    @Column(name="ITEM")
    private String item;
    @Column(name="ACCOUNT_NAME")
    private String accountName;
    @Column(name="QTY")
    private float qty;
    @Column(name="COST")
    private float cost;
    @Column(name="DISCOUNT")
    private float discount;
    @Column(name="TAX_TYPE")
    private String taxType;
    @Column(name="AMOUNT")
    private float amount;
    @Column(name="CRAT")
    private String crAt;
    @Column(name="CRBY")
    private String crBy;
    @Column(name="UPAT")
    private String upAt;
    @Column(name="UPBY")
    private String upBy;
    @Column(name="LANDED_COST")
    private float landedCost;
    @Column(name="DISCOUNT_TYPE")
    private String discountType;
    @Column(name="BASETOORDERCURRENCY")
    private float baseToOrderCurrency;
    @Column(name="CURRENCYUSEQT")
    private float currencySequence;
    @Column(name="LOC")
    private String loc;
    @Column(name="UOM")
    private String uom;
    @Column(name="BATCH")
    private String batch;
    @Column(name="DEBITNOTE_QTY")
    private float debitNoteQty;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID")
    private Integer id;
}

