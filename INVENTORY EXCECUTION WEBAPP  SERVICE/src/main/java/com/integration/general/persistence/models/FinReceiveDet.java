package com.integration.general.persistence.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="##plant##FINRECEIVEDET")
@Getter
@Setter
public class FinReceiveDet {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;
    @Column(name="PLANT")
    private String plant;
    @Column(name="LNNO")
    private int lnNo;
    @Column(name="RECEIVEHDRID")
    private int receiveHdrId;
    @Column(name="INVOICEHDRID")
    private int invoiceHdrId;
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
    @Column(name="DONO")
    private String doNo;
    @Column(name="TYPE")
    private String type;
    @Column(name="BALANCE")
    private float balance;
    @Column(name="ADVANCEFROM")
    private String advanceForm;
    @Column(name="CREDITNOTEHDRID")
    private int creditNoteHdrId;
    @Column(name="CREDITAPPLYKEY")
    private String creditApplyKey;
    @Column(name="CURRENCYTOBASE")
    private float currencyToBase;
    @Column(name="BASETOORDERCURRENCY")
    private float baseToOrderCurrency;
    @Column(name="CURRENCYUSEQT")
    private float currencyUseQt;
    @Column(name="TOTAL_PAYING")
    private String totalPaying; //changes float to string
}