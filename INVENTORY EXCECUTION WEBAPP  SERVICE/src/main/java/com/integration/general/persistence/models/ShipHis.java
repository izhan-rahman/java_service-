package com.integration.general.persistence.models;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity @Table(name="##plant##SHIPHIS ") 
@Getter @Setter
public class ShipHis {
	@Column(name="PLANT")
	private String plant;
	@Column(name="DONO")
	private String doNo;
	@Column(name="DOLNO")
	private String doLineNo;
	@Column(name="CNAME")
	private String customerName;
	@Column(name="ITEM")
	private String item;
	@Column(name="ITEMDESC")
	private String itemDescription;
	@Column(name="BATCH")
	private String batch;
	@Column(name="ORDQTY")
	private Float orderQuantity;
	@Column(name="PICKQTY")
	private Float pickQuantity;
	@Column(name="REVERSEQTY")
	private Float reverseQuantity;
	@Column(name="LOC")
	private String location;
	@Column(name="LOC1")
	private String locationOne;
	@Column(name="EXPIRYDAT")
	private String expireDate;
	@Column(name="PICKSTATUS")
	private String pickStatus;
	@Column(name="STATUS")
	private String status;
	@Column(name="REMARK")
	private String reMark;
	@Column(name="CONTAINER")
	private String container;
	@Column(name="CRAT")
	private String crAt;
	@Column(name="CRBY")
	private String crBy;
	@Column(name="CRTIME")
	private String crTime;
	@Column(name="UPAT")
	private String upAt;
	@Column(name="UPBY")
	private String upBy;
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
	@Column(name="CURRENCYID")
	private String currencyId;
	@Column(name="UNITPRICE")
	private float unitPrice;
	@Column(name="PRINTSTATUS")
	private String printStatus;
	@Column(name="ISSUEDATE")
	private String issueDate;
	@Column(name="REFNO")
	private String referenceNo;
	@Column(name="RSNCODE")
	private String rsnCode;
	@Column(name="EMPNO")
	private String empNo;
	@Column(name="TRAN_TYPE")
	private String tranType;
	@Column(name="INVOICENO")
	private String invoiceNo;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="BEAN_ID")
	private Integer beanId;
	@Column(name="ID")
	private Integer id;
	@Column(name="SID")
	private Integer sid;
	@Column(name="PDASIGNPATH")
	private String pdaSignPath;
	@Column(name="PACKINGLIST")
	private String packingList;
	@Column(name="DELIVERYNOTE")
	private String deliveryNote;
	@Column(name="SIGNATURENAME")
	private String signatureName;
	@Column(name="SIGNATUREEMAIL")
	private String signatureEmail;
}