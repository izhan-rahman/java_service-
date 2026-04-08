package com.integration.general.persistence.models;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class DoHdrTest {
    @Column(name = "PLANT")
    private String plant;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "DONO")
    private String doNo;
    @Column(name = "VENDNO")
    private String vendNo;
    @Column(name = "ORDDATE")
    private String orderDate;
    @Column(name = "ORDERTYPE")
    private String orderType;
    @Column(name = "DELDATE")
    private String deleteDate;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "PickStaus")
    private String pickStatus;
    @Column(name = "SHIPMOD")
    private String shipMod;
    @Column(name = "SHIPVIA")
    private String shipVia;
    @Column(name = "TERMS")
    private String terms;
    @Column(name = "POTYPE")
    private String poType;
    @Column(name = "POSTAT")
    private String poStat;
    @Column(name = "TOTQTY")
    private Float totalQuantity;
    @Column(name = "TOTWGT")
    private Float totalWeight;
    @Column(name = "COMMENT1")
    private String commentOne;
    @Column(name = "COMMENT2")
    private String commentTwo;
    @Column(name = "LBLGROUP")
    private String lblGroup;
    @Column(name = "LBLCAT")
    private Integer lblCat;
    @Column(name = "LBLTYPE")
    private Integer lblType;
    @Column(name = "ORDTRK1")
    private String orderTakenOne;
    @Column(name = "ORDTRK2")
    private String orderTakenTwo;
    @Column(name = "PRIORTY")
    private Integer priority;
    @Column(name = "CRAT")
    private String crAt;
    @Column(name = "CRBY")
    private String crBy;
    @Column(name = "UPAT")
    private String upAt;
    @Column(name = "UPBY")
    private String upBy;
    @Column(name = "RECSTAT")
    private String recStat;
    @Column(name = "CustCode")
    private String customerCode;
    @Column(name = "CustName")
    private String customerName;
    @Column(name = "JobNum")
    private String jobNumber;
    @Column(name = "PersonInCharge")
    private String personInCharge;
    @Column(name = "contactNum")
    private String contactNumber;
    @Column(name = "Address")
    private String address;
    @Column(name = "Address2")
    private String addressTwo;
    @Column(name = "Address3")
    private String addressThree;
    @Column(name = "CollectionDate")
    private String collectionDate;
    @Column(name = "CollectionTime")
    private String collectionTime;
    @Column(name = "Remark1")
    private String remarkOne = "";
    @Column(name = "Remark2")
    private String remarkTwo = "";
    @Column(name = "SHIPPINGID")
    private String shippingId;
    @Column(name = "SHIPPINGCUSTOMER")
    private String shippingCustomer = "";
    @Column(name = "USERFLG1")
    private String userFlagOne;
    @Column(name = "USERFLG2")
    private String userFlagTwo;
    @Column(name = "USERFLG3")
    private String userFlagThree;
    @Column(name = "USERFLG4")
    private String userFlagFour;
    @Column(name = "USERFLG5")
    private String userFlagFive;
    @Column(name = "USERFLG6")
    private String userFlagSix;
    @Column(name = "USERDBL1")
    private Float userDblOne;
    @Column(name = "USERDBL2")
    private Float userDblTwo;
    @Column(name = "USERDBL3")
    private Float userDblThree;
    @Column(name = "USERDBL4")
    private Float userDblFour;
    @Column(name = "USERDBL5")
    private Float userDblFive;
    @Column(name = "USERDBL6")
    private Float userDblSix;
    @Column(name = "CURRENCYID")
    private String currencyId;
    @Column(name = "DELIVERYDATE")
    private String deliveryDate = "";
    @Column(name = "TIMESLOTS")
    private String timeSlot;
    @Column(name = "OUTBOUND_GST")
    private Float outboundGst;
    @Column(name = "STATUS_ID")
    private String statusId;
    @Column(name = "EMPNO")
    private String employeeNumber = "";
    @Column(name = "ESTNO")
    private String estimateNumber;
    @Column(name = "PAYMENT_STATUS")
    private String paymentStatus;
    @Column(name = "Remark3")
    private String remarkThree = "";
    @Column(name = "ORDERDISCOUNT")
    private Float orderDiscount;
    @Column(name = "SHIPPINGCOST")
    private Float shippingCost;
    @Column(name = "INCOTERMS")
    private String incoterms = "";
    @Column(name = "DNPLREMARKS")
    private String dnplRemarks;
    @Column(name = "PAYMENTTYPE")
    private String paymentType = "";
    @Column(name = "DELIVERYDATEFORMAT")
    private Integer deliveryDateFormat;
    @Column(name = "APPROVESTATUS")
    private String approveStatus;
    @Column(name = "SALES_LOCATION")
    private String salesLocation = "";
    @Column(name = "TAXTREATMENT")
    private String taxTreatment = "";
    @Column(name = "ORDER_STATUS")
    private String orderStatus;
    @Column(name = "DISCOUNT")
    private Float discount;
    @Column(name = "DISCOUNT_TYPE")
    private String discountType;
    @Column(name = "ADJUSTMENT")
    private Float adjustment;
    @Column(name = "ITEM_RATES")
    private Integer itemRates;
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
    @Column(name = "ISSHIPPINGTAX")
    private Integer isShippingTax;
}