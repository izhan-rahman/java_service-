package com.integration.general.persistence.models;

import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Table(name="##plant##FINRECEIVEHDR")
@Getter @Setter
public class FinReceiveHdr {
    @Column(name="PLANT")
    private String plant;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;
    @Column(name="CUSTNO")
    private String customerNo;
    @Column(name="TRANSACTIONID")
    private int transactionId;
    @Column(name="AMOUNTRECEIVED")
    private float amountReceived;
    @Column(name="AMOUNTUFP")
    private float amountUfp;
    @Column(name="AMOUNTREFUNDED")
    private float amountRefunded;
    @Column(name="RECEIVE_DATE")
    private String receiveDate;
    @Column(name="RECEIVE_MODE")
    private String receiveMode;
    @Column(name="DEPOSIT_TO")
    private String depositTo;
    @Column(name="BANK_BRANCH")
    private String bankBranch;
    @Column(name="BANK_CHARGE")
    private float bankCharge;
    @Column(name="CHECQUE_NO")
    private String chequeNo;
    @Column(name="REFERENCE")
    private String reference;
    @Column(name="NOTE")
    private String note;
    @Column(name="CRAT")
    private String crAt;
    @Column(name="CRBY")
    private String crBy;
    @Column(name="UPAT")
    private String upAt;
    @Column(name="UPBY")
    private String upBy;
    @Column(name="CREDITAPPLYKEY")
    private String creditApplyKey;
    @Column(name="ACCOUNT_NAME")
    private String amountName;
    @Column(name="CHEQUE_DATE")
    private String chequeDate;
    @Column(name="ISPDCPROCESS")
    private int isPdcProcess;
    @Column(name="CURRENCYID")
    private String currencyId;
    @Column(name="PROJECTID")
    private int projectId;
}
