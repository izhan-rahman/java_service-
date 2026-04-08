package com.integration.general.persistence.models;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="##plant##FINSORETURN")
@Getter
@Setter
public class SalesReturn {
    @Column(name="PLANT")
    private String plant;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;
    @Column(name="DONO")
    private String doNo;
    @Column(name="LNNO")
    private int lnNo;
    @Column(name="INVOICE")
    private String invoice;
    @Column(name="ITEM")
    private String item;
    @Column(name="CUSTNO")
    private String custNo;
    @Column(name="LOC")
    private String loc;
    @Column(name="BATCH")
    private String batch;
    @Column(name="RETURN_DATE")
    private String returnDate;
    @Column(name="RETURN_QTY")
    private float returnQty;
    @Column(name="STATUS")
    private String status;
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
    @Column(name="SORETURN")
    private String soReturn;
    @Column(name="GINO")
    private String giNo;
    @Column(name="CREDITNOTE_QTY")
    private float creditNoteQty;
}
