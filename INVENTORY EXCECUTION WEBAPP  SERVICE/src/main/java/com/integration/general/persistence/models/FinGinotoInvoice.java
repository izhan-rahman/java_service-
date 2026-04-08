package com.integration.general.persistence.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="##plant##FINGINOTOINVOICE")
@Getter
@Setter
public class FinGinotoInvoice {
    @Column(name="PLANT")
    private String plant;
    @Column(name="GINO")
    private String giNo;
    @Column(name="CUSTNO")
    private String custNo;
    @Column(name="DONO")
    private String doNo;
    @Column(name="STATUS")
    private String status;
    @Column(name="QTY")
    private Float quantity;
    @Column(name="AMOUNT")
    private Float amount;
    @Column(name="CRAT")
    private String crAt;
    @Column(name="CRBY")
    private String crBy;
    @Column(name="UPAT")
    private String upAt;
    @Column(name="UPBY")
    private String upBy;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID")
    private Integer id;
}
