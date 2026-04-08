package com.integration.general.persistence.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="##plant##POSRETURNHDR ")
@Getter
@Setter
public class POSReturnHdr {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;
    @Column(name="PLANT")
    private String plant;
    @Column(name="PRNO")
    private String prNo;
    @Column(name="DONO")
    private String doNo;
    @Column(name="PRDATE")
    private String prDate;
    @Column(name="STATUS")
    private String status;
    @Column(name="CustCode")
    private String custCode;
    @Column(name="CustName")
    private String custName;
    @Column(name="Remark1")
    private String remark1;
    @Column(name="Remark2")
    private String remark2;
    @Column(name="CURRENCYID")
    private String currencyId;
    @Column(name="OUTBOUND_GST")
    private String outboundGst;
    @Column(name="EMPNO")
    private String emNo;
    @Column(name="CURRENCYUSEQT")
    private Float currencyusEqt;
    @Column(name="TAXID")
    private int taxId;
    @Column(name="CRAT")
    private String crAt;
    @Column(name="CRBY")
    private String crBy;
    @Column(name="UPAT")
    private String upAt;
    @Column(name="UPBY")
    private String upBy;
}
