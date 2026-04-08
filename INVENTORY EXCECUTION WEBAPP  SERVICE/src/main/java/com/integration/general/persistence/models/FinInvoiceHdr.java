package com.integration.general.persistence.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="##plant##FININVOICEHDR")
public class FinInvoiceHdr {
    @Column(name="PLANT")
    private String plant;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;
    @Column(name="CUSTNO")
    private String custNo;
    @Column(name="INVOICE")
    private String invoice;
    @Column(name="DONO")
    private String doNo;
    @Column(name="INVOICE_DATE")
    private String invoiceDate;
    @Column(name="DUE_DATE")
    private String dueDate;
    @Column(name="PAYMENT_TERMS")
    private String paymentTerms;
    @Column(name="EMPNO")
    private String empNo;
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
    private Float totalAmount; //changes float to string
    @Column(name="BILL_STATUS")
    private String billStatus;
    @Column(name="NOTE")
    private String note;
    @Column(name="TERMSCONDITIONS")
    private String termsConditions;
    @Column(name="CRAT")
    private String crAt;
    @Column(name="CRBY")
    private String crBy;
    @Column(name="UPAT")
    private String upAt;
    @Column(name="UPBY")
    private String upBy;
    @Column(name="ADVANCEFROM")
    private String advanceFrom;
    @Column(name="ISEXPENSE")
    private int isExpense;
    @Column(name="SALES_LOCATION")
    private String salesLocation;
    @Column(name="TAXTREATMENT")
    private String taxTreatment;
    @Column(name="CREDITNOTESSTATUS")
    private int creditNotesStatus;
    @Column(name="TAXAMOUNT")
    private float taxAmount;
    @Column(name="TAX_STATUS")
    private String taxStatus;
    @Column(name="GINO")
    private String giNo;
    @Column(name="ORDER_DISCOUNT")
    private float orderDiscount;
    @Column(name="CURRENCYID")
    private String currencyId;
    @Column(name="CURRENCYTOBASE")
    private float currencyToBase;
    @Column(name="INCOTERMS")
    private String incoterms;
    @Column(name="SHIPPINGID")
    private String shippingId;
    @Column(name="SHIPPINGCUSTOMER")
    private String shippingCustomer;
    @Column(name="ORIGIN")
    private String origin;
    @Column(name="DEDUCT_INV")
    private int deductInv;
    @Column(name="PROJECTID")
    private int projectId;
    @Column(name="CURRENCYUSEQT")
    private float currencyUseqt;
    @Column(name="ORDERDISCOUNTTYPE")
    private String orderDiscountType;
    @Column(name="TAXID")
    private int taxId;
    @Column(name="ISDISCOUNTTAX")
    private int isDiscountTax;
    @Column(name="ISORDERDISCOUNTTAX")
    private int isOrderDiscountTax;
    @Column(name="ISSHIPPINGTAX")
    private int isShippingTax;
    @Column(name="OUTBOUD_GST")
    private float outboundGst;
    @Column(name="JobNum")
    private String jobNum;
    @Column(name="TOTAL_PAYING")
    private String totalPaying; //changes float to string
    @Column(name ="ORDERTYPE")
    private String orderType;
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
    @Column(name ="DELIVERY_PERSON")
    private String deliveryPerson;
    @Column(name ="DELIVERY_PERSON_EMAIL")
    private String deliveryPersonEmail;
    @Column(name ="DELIVERY_DATE")
    private String deliveryDate;
    @Column(name ="PEPPOL_DOC_ID")
    private String peppolDocId;
    @Column(name ="PEPPOL_STATUS")
    private Integer peppolStatus;
    @Column(name ="TRANSPORTID")
    private Integer transportId;


}

