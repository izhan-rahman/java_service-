package com.integration.general.persistence.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity @Table(name="##plant##DODET") 
@Getter @Setter
public class DoDet {
	@Column(name="PLANT")
	private String plant;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;

	@Column(name="DONO")
	private String doNo;
	@Column(name="DOLNNO")
	private int doLineNo;
	@Column(name="PickStatus")
	private String pickStatus;
	@Column(name="LNSTAT")
	private String lineStatus;
	@Column(name="ITEM")
	private String item;
	@Column(name="ItemDesc")
	private String itemDescription;
	@Column(name="TRANDATE")
	private String transactionDate;
	/*@Column(name="TRANTYPE")
	private String transactionType;*/
	@Column(name="UNITPRICE")
	private Float unitPrice;
	/*@Column(name="ASNMT")
	private String asnMt;*/
	@Column(name="QTYOR")
	private float quantityOr;
	@Column(name="QTYIS")
	private Float quantityIs;
	@Column(name="QtyPick")
	private Float quantityPick;
	/*@Column(name="QTYAC")
	private Float quantityAc;
	@Column(name="QTYRJ")
	private Float quantityRj;
	@Column(name="LOC")
	private String location;
	@Column(name="WHID")
	private String whId;
	@Column(name="POLTYPE")
	private String polType;*/
	@Column(name="UNITMO")
	private String unitMo;
	/*@Column(name="DELDATE")
	private String deleteDate;
	@Column(name="COMMENT1")
	private String commentOne;
	@Column(name="COMMENT2")
	private String commentTwo;*/
	@Column(name="CRAT")
	private String crAt;
	@Column(name="CRBY")
	private String crBy;
	@Column(name="UPAT")
	private String upAt;
	@Column(name="UPBY")
	private String upBy;
	/*@Column(name="RECSTAT")
	private String recStatus;*/
	@Column(name="USERFLD1")
	private String userFieldOne;
	@Column(name="USERFLD2")
	private String userFieldTwo;
	@Column(name="USERFLD3")
	private String userFieldThree;
	/*@Column(name="USERFLD4")
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
	@Column(name="USERTIME3")
	private String userTimeThree;
	@Column(name="USERDBL1")
	private Float userDblOne;
	@Column(name="USERDBL2")
	private Float userDblTwo;
	@Column(name="USERDBL3")
	private Float userDblThree;
	@Column(name="USERDBL4")
	private Float userDblFour;
	@Column(name="USERDBL5")
	private Float userDblFive;
	@Column(name="USERDBL6")
	private Float userDblSix;*/
	@Column(name="CURRENCYUSEQT")
	private Float currencySequence;
	@Column(name="ESTNO")
	private String estimateNo;
	@Column(name = "ESTLNNO")
	private int estimateLineNo;
	@Column(name = "PRODGST")
	private Float productGst;
	/*@Column(name = "PACKING")
	private String packing;
	@Column(name = "DIMENSION")
	private String dimension;
	@Column(name = "NETWEIGHT")
	private Float netWeight;
	@Column(name = "GROSSWEIGHT")
	private Float grossWeight;*/
	@Column(name = "PRODUCTDELIVERYDATE")
	private String productDeliveryDate = "";
	@Column(name = "ACCOUNT_NAME")
	private String accountName;
	@Column(name = "TAX_TYPE")
	private String taxType = "";
	@Column(name = "DISCOUNT")
	private Float discount;
	@Column(name = "DISCOUNT_TYPE")
	private String discountType = "";
	@Column(name = "ADDONAMOUNT")
	private Float addOnAmount;
	@Column(name = "ADDONTYPE")
	private String addOnType = "";
	@Column(name = "UNITCOST")
	private Float unitCost;
	@Column(name = "SALESMAN")
	private String salesMan = "";
	@Column(name = "ISFOC")
	private Integer isFoc;
	@Column(name = "FOCLNNO")
	private Integer focLnno;
	@Column(name = "UKEY")
	private String uniqueKey = "";
}