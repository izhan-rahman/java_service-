package com.integration.general.persistence.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "##plant##FINCUSTOMERCREDITNOTEHDR")
@Getter
@Setter
public class FinCustomerCreditNoteHdr {
    @Column(name = "PLANT")
    private String plant;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "CUSTNO")
    private String cstNo;
    @Column(name = "CREDITNOTE")
    private String creditNote;
    @Column(name = "DONO")
    private String doNo;
    @Column(name = "CREDIT_DATE")
    private String creditDate;
    @Column(name = "ITEM_RATES")
    private Integer itemRates;
    @Column(name = "EMPNO")
    private String empNo;
    @Column(name = "SUB_TOTAL")
    private Float subTotal;
    @Column(name = "SHIPPINGCOST")
    private Float shippingCost;
    @Column(name = "ADJUSTMENT")
    private Float adjustment;
    @Column(name = "DISCOUNT")
    private Float discount;
    @Column(name = "DISCOUNT_TYPE")
    private String discountType;
    @Column(name = "DISCOUNT_ACCOUNT")
    private String discountAmount;
    @Column(name = "TOTAL_AMOUNT")
    private Float totalAmount;
    @Column(name = "CREDIT_STATUS")
    private String creditStatus;
    @Column(name = "NOTE")
    private String note;
    @Column(name = "TERMSCONDITIONS")
    private String termsConditions;
    @Column(name = "CRAT")
    private String crAt;
    @Column(name = "CRBY")
    private String crBy;
    @Column(name = "UPAT")
    private String upAt;
    @Column(name = "UPBY")
    private String upBy;
    @Column(name = "ADJUSTMENT_LABEL")
    private String adjustmentLabel;
    @Column(name = "INVOICE")
    private String invoice;
    @Column(name = "REFERENCE")
    private String reference;
    @Column(name = "SALES_LOCATION")
    private String salesLocation;
    @Column(name = "TAXTREATMENT")
    private String taxTreatment;
    @Column(name = "TAXAMOUNT")
    private Float taxAmount;
    @Column(name = "GINO")
    private String giNo;
    @Column(name = "ORDER_DISCOUNT")
    private Float orderDiscount;
    @Column(name = "SORETURN")
    private String soReturn;
    @Column(name = "CURRENCYID")
    private String currecnyId;
    @Column(name = "PROJECTID")
    private Integer projectId;
    @Column(name = "CURRENCYUSEQT")
    private Float currencyUseQt;
    @Column(name = "ORDERDISCOUNTTYPE")
    private String orderDiscountType;
    @Column(name = "TAXID")
    private Integer taxId;
    @Column(name = "ISDISCOUNTTAX")
    private Integer isDiscountTax;
    @Column(name = "ISORDERDISCOUNTTAX")
    private Integer isOrderDiscountTax;
    @Column(name = "OUTBOUD_GST")
    private Float outboundGst;
    @Column(name = "SHIPPINGID")
    private String shippingId;
    @Column(name = "SHIPPINGCUSTOMER")
    private String shippingCustomer;
}