package com.integration.general.persistence.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="##plant##FINGRNOTOBILL")
@Getter
@Setter
public class FinGrnotoBill {
    @Column(name="PLANT")
    private String plant;
    @Column(name="GRNO")
    private String grNo;
    @Column(name="VENDNO")
    private String vendNo;
    @Column(name="PONO")
    private String poNo;
    @Column(name="STATUS")
    private String status;
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
    @Column(name="QTY")
    private Float quantity;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID")
    private Integer id;
}
