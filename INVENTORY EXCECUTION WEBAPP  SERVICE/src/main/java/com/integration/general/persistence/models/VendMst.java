package com.integration.general.persistence.models;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity @Table(name="##plant##VENDMST ") 
@Getter @Setter
public class VendMst {
	@Column(name="PLANT")
	private String plant;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	@Column(name="VENDNO")
	private String vendNo;
	@Column(name="VENDID")
	private String vendId;
	@Column(name="VENDDESC")
	private String vendDescription;
	@Column(name="COMMENT1")
	private String commentOne;
	@Column(name="ACTIVEF")
	private String activeF;
	@Column(name="VNAME")
	private String vName;
	@Column(name="NAME")
	private String name;
	@Column(name="DESGINATION")
	private String designation;
	@Column(name="TELNO")
	private String telephoneNo;
	@Column(name="HPNO")
	private String hpNo;
	@Column(name="FAX")
	private String fax;
	@Column(name="EMAIL")
	private String eMail;
	@Column(name="ADDR1")
	private String addressOne;
	@Column(name="ADDR2")
	private String addressTwo;
	@Column(name="ADDR3")
	private String addressThree;
	@Column(name="ADDR4")
	private String addressFour;
	@Column(name="STATE")
	private String state;
	@Column(name="COUNTRY")
	private String country;
	@Column(name="ZIP")
	private String zip;
	@Column(name="REMARKS")
	private String reMark;
	@Column(name="CRAT")
	private String crAt;
	@Column(name="CRBY")
	private String crBy;
	@Column(name="UPAT")
	private String upAt;
	@Column(name="UPBY")
	private String upBy;
	@Column(name="RECSTAT")
	private String recStatus;
	@Column(name="USERFLD1")
	private String userFieldOne;
	@Column(name="USERFLD2")
	private String userFieldTwo;
	@Column(name="USERFLD3")
	private String userFieldThree;
	@Column(name="USERFLD4")
	private String userFieldFour;
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
	@Column(name="IsActive")
	private String isActive;
	@Column(name="PAY_TERMS")
	private String payTerms;
	@Column(name="PAY_IN_DAYS")
	private String payInDays;
	@Column(name="WEBSITE")
	private String website;
	@Column(name="RCBNO")
	private String rcbNo;
	@Column(name="SUPPLIER_TYPE_ID")
	private String supplierTypeId;
	@Column(name="BANK_BRANCH_NO")
	private String bankBranchNo;
	@Column(name="SKYPEID")
	private String skypeId;
	@Column(name="FACEBOOKID")
	private String facebookId;
	@Column(name="TWITTERID")
	private String twitterId;
	@Column(name="LINKEDINID")
	private String linkedInId;
	@Column(name="WORKPHONE")
	private String workPhone;
	@Column(name="CUSTOMEREMAIL")
	private String customerEmail;
	@Column(name="OPENINGBALANCE")
	private float openingBalance;
	@Column(name="TAXTREATMENT")
	private String taxTreatment;
	@Column(name="BANKNAME")
	private String BankName;
	@Column(name="IBAN")
	private String iBan;
	@Column(name="BANKROUTINGCODE")
	private String bankRoutingCode;
	@Column(name="COMPANYREGNUMBER")
	private String companyRegisterNo;
}