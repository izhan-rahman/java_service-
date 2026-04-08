package com.integration.general.persistence.models;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity @Table(name="##plant##RECVDET") 
@Getter @Setter
public class RecvDet {
	@Column(name="PLANT")
	private String plant;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="BEAN_ID")
	private int beanId;
	@Column(name="PONO")
	private String poNo;
	@Column(name="CNAME")
	private String customerName;
	@Column(name="ITEM")
	private String item;
	@Column(name="ITEMDESC")
	private String itemDescription;
	@Column(name="BATCH")
	private String batch;
	@Column(name="LNNO")
	private String lineNo;
	@Column(name="ORDQTY")
	private float orderQuantity;
	@Column(name="RECQTY")
	private float receiveQuantity;
	@Column(name="PUTAWAYQTY")
	private float putAwayQuantity;
	@Column(name="REVERSEQTY")
	private float reverseQuantity;
	@Column(name="LOC")
	private String location;
	@Column(name="LOC1")
	private String locationOne;
	@Column(name="EXPIRYDAT")
	private String expireDate;
	@Column(name="RECEIVESTATUS")
	private String receiveStatus;
	@Column(name="PUTAWAYSTATUS")
	private String putAwayStatus;
	@Column(name="STATUS")
	private String status;
	@Column(name="REMARK")
	private String reMark;
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
	@Column(name="UNITCOST")
	private float unitCost;
	@Column(name="CURRENCYID")
	private String currencyId;
	@Column(name="MANUFACTURER")
	private String manufacturer;
	@Column(name="TRAN_TYPE")
	private String transactionType;
	@Column(name="RECVDATE")
	private String receiveDate;
	@Column(name="REFNO")
	private String referenceNo;
	@Column(name="RSNCODE")
	private String rsnCode;
	@Column(name="EMPNO")
	private String employeeNo;
	@Column(name="GRNO")
	private String grNo;
	@Column(name="ID")
	private int id;
	@Column(name="BILL_STATUS")
	private String billStatus;
}