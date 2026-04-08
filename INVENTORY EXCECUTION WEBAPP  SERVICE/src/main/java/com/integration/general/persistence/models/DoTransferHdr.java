package com.integration.general.persistence.models;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity @Table(name="##plant##DOTRANSFERHDR") 
@Getter @Setter
public class DoTransferHdr {
	@Column(name="PLANT")
	private String plant;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	@Column(name="DONO")
	private String doNo;
	@Column(name="VENDNO")
	private String vendNo;
	@Column(name="ORDDATE")
	private String orderDate;
	@Column(name="DELDATE")
	private String deleteDate;
	@Column(name="STATUS")
	private String status;
	@Column(name="PickStaus")
	private String pickStatus;
	@Column(name="SHIPMOD")
	private String shipMod;
	@Column(name="SHIPVIA")
	private String shipVia;
	@Column(name="TERMS")
	private String terms;
	@Column(name="POTYPE")
	private String poType;
	@Column(name="POSTAT")
	private String poStat;
	@Column(name="TOTQTY")
	private float totalQuantity;
	@Column(name="TOTWGT")
	private float totalWeight;
	@Column(name="COMMENT1")
	private String commentOne;
	@Column(name="COMMENT2")
	private String commentTwo;
	@Column(name="LBLGROUP")
	private String lblGroup;
	@Column(name="LBLCAT")
	private int lblCat;
	@Column(name="LBLTYPE")
	private int lblType;
	@Column(name="ORDTRK1")
	private String OrderTakenOne;
	@Column(name="ORDTRK2")
	private String OrderTakenTwo;
	@Column(name="PRIORTY")
	private int priorty;
	@Column(name="CRAT")
	private String crAt;
	@Column(name="CRBY")
	private String crBy;
	@Column(name="UPAT")
	private String upAt;
	@Column(name="UPBY")
	private String upBy;
	@Column(name="RECSTAT")
	private String recStat;
	@Column(name="CustCode")
	private String customerCode;
	@Column(name="CustName")
	private String customerName;
	@Column(name="JobNum")
	private String jobNumber;
	@Column(name="PersonInCharge")
	private String personInCharge;
	@Column(name="contactNum")
	private String contactNumber;
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
	@Column(name="USERFLD1")
	private String userFieldOne;
	@Column(name="USERFLD2")
	private String userFieldTwo;
	@Column(name="USERFLD3")
	private String userFieldThree;
	@Column(name="USERFLD4")
	private String userFieldFour;
	@Column(name="USERFLD5")
	private String userFieldFive;
	@Column(name="USERFLD6")
	private String userFieldSix;
	@Column(name="USERFLG1")
	private String userFlagOne;
	@Column(name="USERFLG2")
	private String userFlagTwo;
	@Column(name="USERFLG3")
	private String userFlagThree;
	@Column(name="USERFLG4")
	private String userFlagFour;
	@Column(name="USERFLG5")
	private String userFlagFive;
	@Column(name="USERFLG6")
	private String userFlagSix;
	@Column(name="USERTIME1")
	private String userTimeOne;
	@Column(name="USERTIME2")
	private String userTimeTwo;
	@Column(name="USERDBL1")
	private float userDblOne;
	@Column(name="USERDBL2")
	private float userDblTwo;
	@Column(name="USERDBL3")
	private float userDblThree;
	@Column(name="USERDBL4")
	private float userDblFour;
	@Column(name="USERDBL5")
	private float userDblFive;
	@Column(name="USERDBL6")
	private float userDblSix;
	@Column(name="DELIVERYDATE")
	private String deliveryDate;
	@Column(name="TIMESLOTS")
	private String timeSlots;
	@Column(name="OUTBOUND_GST")
	private float outboundGst;
	@Column(name="EMPNO")
	private String employeeNumber;
	@Column(name="ESTNO")
	private String estimateNumber;
	@Column(name="PAYMENT_STATUS")
	private String paymentstatus;
	@Column(name="Remark3")
	private String remarkThree;
	@Column(name="SHIPPINGID")
	private String shippingId;
	@Column(name="SHIPPINGCUSTOMER")
	private String shippingCustomer;
	@Column(name="ORDERDISCOUNT")
	private float orderDiscount;
	@Column(name="SHIPPINGCOST")
	private float shippingCost;
	@Column(name="INCOTERMS")
	private String incoterms;
	@Column(name="PAYMENTTYPE")
	private String paymentType;
	@Column(name="DELIVERYDATEFORMAT")
	private int deliveryDateFormat;
	@Column(name="SALES_LOCATION")
	private String salesLocation;
	@Column(name="TAXTREATMENT")
	private String taxTreatment;
	@Column(name="ORDER_STATUS")
	private String orderStatus;
	@Column(name="DISCOUNT")
	private float discount;
	@Column(name="DISCOUNT_TYPE")
	private String discountType;
	@Column(name="ADJUSTMENT")
	private float adjustment;
	@Column(name="PROJECTID")
	private int projectId;
	@Column(name="TAXID")
	private int taxId;
}