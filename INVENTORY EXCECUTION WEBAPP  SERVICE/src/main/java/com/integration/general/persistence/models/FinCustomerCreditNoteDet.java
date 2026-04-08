package com.integration.general.persistence.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "##plant##FINCUSTOMERCREDITNOTEDET")
@Getter
@Setter
public class FinCustomerCreditNoteDet {
    @Column(name = "PLANT")
    private String plant;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "LNNO")
    private int lnNo;
    @Column(name = "HDRID")
    private int hdrId;
    @Column(name = "ACCOUNT_NAME")
    private String accountName;
    @Column(name = "ITEM")
    private String item;
    @Column(name = "QTY")
    private float qty;
    @Column(name = "UNITPRICE")
    private float unitPrice;
    @Column(name = "DISCOUNT")
    private float discount;
    @Column(name = "TAX_TYPE")
    private String taxType;
    @Column(name = "AMOUNT")
    private float amount;
    @Column(name = "CRAT")
    private String crAt;
    @Column(name = "CRBY")
    private String crBy;
    @Column(name = "UPAT")
    private String upAt;
    @Column(name = "UPBY")
    private String upBy;
    @Column(name = "DISCOUNT_TYPE")
    private String discountType;
    @Column(name = "CURRENCYTOBASE")
    private float currencyToBase;
    @Column(name = "BASETOORDERCURRENCY")
    private float baseToOrderCurrency;
    @Column(name = "CURRENCYUSEQT")
    private float currencyUseQt;
}