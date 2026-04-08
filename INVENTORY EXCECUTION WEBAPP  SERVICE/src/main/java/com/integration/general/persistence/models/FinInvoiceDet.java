package com.integration.general.persistence.models;


 import lombok.Getter;
 import lombok.Setter;

 import javax.persistence.*;

@Entity
@Table(name="##plant##FININVOICEDET")
@SecondaryTable(name = "##plant##FINSORETURN")
@SecondaryTable(name = "##plant##ITEMMST")
@Getter
@Setter
public class FinInvoiceDet {
    @Column(name="PLANT")
    private String plant;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;
    @Column(name="LNNO")
    private int lnNo;
    @Column(name="INVOICEHDRID")
    private int invoiceHdrId;
    @Column(name="ITEM")
    private String item;
    @Column(name="ACCOUNT_NAME")
    private String accountName;
    @Column(name="QTY")
    private float qty;
    @Column(name="UNITPRICE")
    private float unitPrice;
    @Column(name="DISCOUNT")
    private float discount;
    @Column(name="TAX_TYPE")
    private String taxType;
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
    @Column(name="DISCOUNT_TYPE")
    private String discountType;
    @Column(name="NOTE")
    private String note;
    @Column(name="BASETOORDERCURRENCY")
    private float baseToOrderCurrency;
    @Column(name="LOC")
    private String loc;
    @Column(name="UOM")
    private String uom;
    @Column(name="BATCH")
    private String batch;
    @Column(name="PACKINGLIST")
    private String packingList;
    @Column(name="DELIVERYNOTE")
    private String deliveryNote;
    @Column(name="CURRENCYUSEQT")
    private float currencyUseqt;
    @Column(name="IS_COGS_SET")
    private String isCogsSet;
    @Column(name="CREDITNOTE_QTY")
    private float creditNoteQty;
    @Column(name="BILLOFENTRY")
    private String billOfEntry;
    @Column(name="ADDONTYPE")
    private String addOnType;
    @Column(name="ADDONAMOUNT")
    private Float addOnAmount;
    @Column(name="UNITCOST")
    private float unitCost;

//    @Column(name="GINO")
//    private String giNo;
//    @Column(name="CUSTNO")
//    private String custNo;
//    @Column(name="RETURN_QTY")
//    private float returnQty;
//    @Column(name = "ITEMDESC")
//    private String itemDescription;
}