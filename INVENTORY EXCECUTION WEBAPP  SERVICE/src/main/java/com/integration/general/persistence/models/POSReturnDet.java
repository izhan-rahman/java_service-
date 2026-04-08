package com.integration.general.persistence.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="##plant##POSRETURNDET ")
@Getter
@Setter
public class POSReturnDet {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;
    @Column(name="PLANT")
    private String plant;
    @Column(name="PRNO")
    private String prNo;
    @Column(name="PRLNNO")
    private int prLnNo;
    @Column(name="ITEM")
    private String item;
    @Column(name="ItemDesc")
    private String itemDescription;
    @Column(name="UNITPRICE")
    private float unitPrice;
    @Column(name="QTY")
    private float quantity;
    @Column(name="LOC")
    private String location;
    @Column(name="PRDATE")
    private String PrDate;
    @Column(name="UOM")
    private String uom;
    @Column(name="CURRENCYUSEQT")
    private Float currencyusEqt;
    @Column(name="PRODGST")
    private Float ProdGst;
    @Column(name="CRAT")
    private String crAt;
    @Column(name="CRBY")
    private String crBy;
    @Column(name="UPAT")
    private String upAt;
    @Column(name="UPBY")
    private String upBy;
}
