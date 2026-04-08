package com.integration.general.persistence.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="##plant##FINBILLHDR")
@Getter
@Setter
public class FinBillHdr {
    @Column(name="PLANT")
    private String plant;
    @Column(name="VENDNO")
    private String vendNo;
    @Column(name="BILL")
    private String bill;
    @Column(name="PONO")
    private String poNo;
    @Column(name="GRNO")
    private String grNo;
    @Column(name="BILL_DATE")
    private String billDate;
    @Column(name="DUE_DATE")
    private String dueDate;
    @Column(name="PAYMENT_TERMS")
    private String paymentTerms;
    @Column(name="ITEM_RATES")
    private int itemRates;
    @Column(name="DISCOUNT")
    private float discount;
    @Column(name="DISCOUNT_TYPE")
    private String discountType;
    @Column(name="DISCOUNT_ACCOUNT")
    private String discountAccount;
    @Column(name="SHIPPINGCOST")
    private float shippingCost;
    @Column(name="ADJUSTMENT")
    private float adjustment;
    @Column(name="SUB_TOTAL")
    private float subTotal;
    @Column(name="TOTAL_AMOUNT")
    private float totalAmount;
    @Column(name="BILL_STATUS")
    private String billStatus;
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
    @Column(name="ADJUSTMENT_LABEL")
    private String adjustmentLabel;
    @Column(name="SHIPMENT_CODE")
    private String shipmentCode;
    @Column(name="REFERENCE_NUMBER")
    private String referenceNumber;
    @Column(name="ADVANCEFROM")
    private String advanceFrom;
    @Column(name="PURCHASE_LOCATION")
    private String purchaseLocation;
    @Column(name="TAXTREATMENT")
    private String taxTreatment;
    @Column(name="REVERSECHARGE")
    private int reverseCharge;
    @Column(name="GOODSIMPORT")
    private int goodsImport;
    @Column(name="CREDITNOTESSTATUS")
    private int creditNotesStatus;
    @Column(name="TAXAMOUNT")
    private float taxAmount;
    @Column(name="TAX_STATUS")
    private String taxStatus;
    @Column(name="ORDER_DISCOUNT")
    private String orderDiscount;
    @Column(name="ISSHIPPINGTAXABLE")
    private int isShippingTaxable;
    @Column(name="CURRENCYID")
    private String currencyId;
    @Column(name="CURRENCYTOBASE")
    private float currencyToBase;
    @Column(name="CURRENCYUSEQT")
    private float currencySequence;
    @Column(name="ORDERDISCOUNTTYPE")
    private String orderDiscountType;
    @Column(name="TAXID")
    private int taxId;
    @Column(name="ISDISCOUNTTAX")
    private int isDiscountTax;
    @Column(name="ISORDERDISCOUNTTAX")
    private int isOrderDiscountTax;
    @Column(name="INBOUND_GST")
    private float inboundGst;
    @Column(name="PROJECTID")
    private int projectId;
    @Column(name="SHIPPINGID")
    private String shippingId;
    @Column(name="SHIPPINGCUSTOMER")
    private String shippingCustomer;
    @Column(name="ORIGIN")
    private String origin;
    @Column(name ="DEDUCT_INV")
    private int deductInv;
    @Column(name="BILL_TYPE")
    private String billType;
    @Column(name ="TRANSPORTID")
    private int transportId;
    @Column(name ="EMPNO")
    private String empNo;
    @Column(name ="SHIPCONTACTNAME")
    private String shipContactName;
    @Column(name ="SHIPDESGINATION")
    private String shipDesignation;
    @Column(name ="SHIPWORKPHONE")
    private String shipWorkPhone;
    @Column(name ="SHIPHPNO")
    private String shipHpNo;
    @Column(name ="SHIPEMAIL")
    private String shipEmail;
    @Column(name ="SHIPCOUNTRY")
    private String shipCountry;
    @Column(name ="SHIPADDR1")
    private String shipAddr1;
    @Column(name ="SHIPADDR2")
    private String shipAddr2;
    @Column(name ="SHIPADDR3")
    private String shipAddr3;
    @Column(name ="SHIPADDR4")
    private String shipAddr4;
    @Column(name ="SHIPSTATE")
    private String shipState;
    @Column(name ="SHIPZIP")
    private String shipZip;
    @Column(name ="ORDERTYPE")
    private String orderType;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID")
    private Integer id;
}
