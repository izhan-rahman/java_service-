package com.integration.general.persistence.models;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity @Table(name="##plant##POHDR")
@Getter @Setter
public class PoHdr {
	@Column(name="PLANT")
	private String plant;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	@Column(name="PONO")
	private String purchaseNo;
	@Column(name="STATUS")
	private String status;
	@Column(name="ORDERTYPE")
	private String orderType;
	@Column(name="DELDATE")
	private String deleteDate;
	@Column(name="CustCode")
	private String customerCode;
	@Column(name="CustName")
	private String customerName;
	@Column(name="JobNum")
	private String jobNo;
	@Column(name="PersonInCharge")
	private String personInCharge;
	@Column(name="contactNum")
	private String contactNo;
	@Column(name="Address")
	private String address;
	@Column(name="Address2")
	private String addressTwo;
	@Column(name="Address3")
	private String addressThree;
	@Column(name="CollectionDate")
	private String collectionDate;
	@Column(name="CollectionTime")
	private String collectionTime;
	@Column(name="Remark1")
	private String remarkOne;
	@Column(name="Remark2")
	private String remarkTwo;
	@Column(name="SHIPPINGID")
	private String shippingId;
	@Column(name="SHIPPINGCUSTOMER")
	private String shippingCustomer;
	@Column(name="INBOUND_GST")
	private float inboundGst;
	@Column(name="CURRENCYID")
	private String currencyId;
	@Column(name="STATUS_ID")
	private String statusId;
	@Column(name="REMARK3")
	private String remarkThree;
	@Column(name="ORDERDISCOUNT")
	private float orderDiscount;
	@Column(name="SHIPPINGCOST")
	private float shippingCost;
	@Column(name="INCOTERMS")
	private String incoterms;
	@Column(name="ADJUSTMENT")
	private float adjustment;
	@Column(name="PAYMENTTYPE")
	private String paymentType;
	@Column(name="DELIVERYDATEFORMAT")
	private int deliveryDateFormat;
	@Column(name="PURCHASE_LOCATION")
	private String purchaseLocation;
	@Column(name="TAXTREATMENT")
	private String taxTreatment;
	@Column(name="ORDER_STATUS")
	private String orderStatus;
	@Column(name="REVERSECHARGE")
	private int reverseCharge;
	@Column(name="GOODSIMPORT")
	private int goodsImport;
	@Column(name="CRAT")
	private String crAt;
	@Column(name="CRBY")
	private String crBy;
	@Column(name="UPAT")
	private String upAt;
	@Column(name="UPBY")
	private String upBy;
	@Column(name="LOCALEXPENSES")
	private float localExpenses;
	@Column(name="ISDISCOUNTTAX")
	private int isDiscountTax;
	@Column(name="ISSHIPPINGTAX")
	private int isShippingTax;
	@Column(name="ISTAXINCLUSIVE")
	private int isTaxInclusive;
	@Column(name="TAXID")
	private int taxId;
	@Column(name="ORDERDISCOUNTTYPE")
	private String orderDiscountType;
	@Column(name="CURRENCYUSEQT")
	private float currencySequence;
	@Column(name="PROJECTID")
	private int projectId;
	@Column(name ="TRANSPORTID")
	private int transportId;
	@Column(name ="PAYMENT_TERMS")
	private String paymentTerms;
	@Column(name ="EMPNO")
	private String empNo;
	@Column(name ="POESTNO")
	private String poEstNo;
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
	@Column(name ="UKEY")
	private String uniqueKey;
	@Column(name ="APPROVAL_STATUS")
	private String approvalSataus;
	@Column(name ="REASON")
	private String reason;
}