package com.integration.general.persistence.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "FINCHARTOFACCOUNTS")
@Getter
@Setter
public class ChartOfAccounts {
    @Column(name = "PLANT")
    private String plant;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "ACCOUNTTYPE")
    private String accountType;
    @Column(name = "ACCOUNTDETAILTYPE")
    private int accountDetailType;
    @Column(name = "ACCOUNT_NAME")
    private String accountName;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "ISSUBACCOUNT")
    private int isSubAccount;
    @Column(name = "SUBACCOUNTNAME")
    private String subAccountName;
    @Column(name = "OPENINGBALANCE")
    private float openingBalance;
    @Column(name = "OPENINGBALANCEDATE")
    private String openingBalanceDate;
    @Column(name = "CRAT")
    private String crAt;
    @Column(name = "CRBY")
    private String crBy;
    @Column(name = "UPAT")
    private String upAt;
    @Column(name = "UPBY")
    private String upBy;
    @Column(name = "LANDEDCOSTCAL")
    private int landedCostCal;
}