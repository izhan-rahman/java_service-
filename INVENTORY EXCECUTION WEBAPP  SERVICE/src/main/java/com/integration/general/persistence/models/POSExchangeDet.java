package com.integration.general.persistence.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="##plant##POSEXCHANGEDET")
@Getter
@Setter
public class POSExchangeDet {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;
    @Column(name="PLANT")
    private String plant;
    @Column(name="PENO")
    private String peNo;
    @Column(name="PELNNO")
    private int peLnNo;
    @Column(name="EXDONO")
    private String exDoNo;
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
    @Column(name="PEDATE")
    private String PeDate;
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
