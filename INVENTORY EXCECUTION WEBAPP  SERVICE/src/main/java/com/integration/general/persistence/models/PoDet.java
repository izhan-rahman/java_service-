package com.integration.general.persistence.models;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity @Table(name="##plant##PODET ")
@Getter @Setter
public class PoDet {
	@Column(name="PLANT")
	private String plant;
	@Column(name="PONO")
	private String poNo;
	@Column(name="POLNNO")
	private int poLineNo;
	@Column(name="LNSTAT")
	private String lineStatus;
	@Column(name="ITEM")
	private String item;
	@Column(name="ItemDesc")
	private String itemDescription;
	@Column(name="TRANDATE")
	private String transactionDate;
	@Column(name="UNITCOST")
	private float unitCost;
	@Column(name="QTYOR")
	private float quantityOr;
	@Column(name="QTYRC")
	private float quantityRc;
	@Column(name="UNITMO")
	private String unitMo;
	@Column(name="USERFLD1")
	private String userFieldOne;
	@Column(name="USERFLD2")
	private String userFieldTwo;
	@Column(name="USERFLD3")
	private String userFieldThree;
	@Column(name="USERFLD4")
	private String userFieldFour;
	@Column(name="CURRENCYUSEQT")
	private float currencySequence;
	@Column(name="PRODGST")
	private float productGst;
	@Column(name="PRODUCTDELIVERYDATE")
	private String productDeliveryDate;
	@Column(name="DISCOUNT")
	private float discount;
	@Column(name="DISCOUNT_TYPE")
	private String discountType;
	@Column(name="ACCOUNT_NAME")
	private String accountName;
	@Column(name="TAX_TYPE")
	private String taxType;
	@Column(name="COMMENT1")
	private String commentOne;
	@Column(name="CRAT")
	private String crAt;
	@Column(name="CRBY")
	private String crBy;
	@Column(name="UPAT")
	private String upAt;
	@Column(name="UPBY")
	private String upBy;
	@Column(name="LOC")
	private String location;
	@Column(name="UNITCOST_AOD")
	private float unitCostAod;
	@Column(name="POESTNO")
	private String poEstNo;
	@Column(name="POESTLNNO")
	private Integer poestLnno;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private String id;
	@Column(name ="UKEY")
	private String uniqueKey;















}