package com.integration.general.persistence.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity @Table(name="##plant##CUSTMST") 
@Getter @Setter
public class CustomerMst {
	@Column(name="PLANT")
	private String plant;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	@Column(name="CUSTNO")
	private String customerNo;
	@Column(name="CNAME")
	private String customerName;
	@Column(name="LNAME")
	private String lastName;
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
	private String email;
	@Column(name="ADDR1")
	private String addressROne;
	@Column(name="ADDR2")
	private String addressRTwo;
	@Column(name="ADDR3")
	private String addressRThree;
	@Column(name="ADDR4")
	private String addressRFour;
	@Column(name="STATE")
	private String state;
	@Column(name="COUNTRY")
	private String country;
	@Column(name="ZIP")
	private String zip;
	@Column(name="REMARKS")
	private String reMarks;
	@Column(name="USERFLG1")
	private String userFlagOne;
	@Column(name="CRAT")
	private String crAt;
	@Column(name="CRBY")
	private String crBy;
	@Column(name="UPAT")
	private String upAt;
	@Column(name="UPBY")
	private String upBy;
	@Column(name="IsActive")
	private String isActive;
	/*@Column(name="NONSTKFLAG")
	private String nonStackFlag;
	@Column(name="NONSTKTYPEID")
	private String nonStackTypeId;
	@Column(name="PASSWORD")
	private String password;*/
	@Column(name="USER_ID")
	private String userId;
	/*@Column(name="PAYMENTMODE")
	private String paymentMode;
	@Column(name="ISMEMBER")
	private String isMember;
	@Column(name="GENDER")
	private String gender;*/
	@Column(name="PAY_TERMS")
	private String payTerms;
	@Column(name="PAY_IN_DAYS")
	private String payInDays;
	@Column(name="CUSTOMER_TYPE_ID")
	private String customerTypeId;
	@Column(name="CUSTOMER_STATUS_ID")
	private String customerStatusId;
	@Column(name="WEBSITE")
	private String website;
	@Column(name="RCBNO")
	private String rcbNo;
	@Column(name="CREDITLIMIT")
	private Float creditLimit;
	@Column(name="ISCREDITLIMIT")
	private String IsCreditLimit;
	@Column(name="SKYPEID")
	private String skypeId;
	@Column(name="FACEBOOKID")
	private String faceBookId;
	@Column(name="TWITTERID")
	private String twitterId;
	@Column(name="LINKEDINID")
	private String linkedinId;
	@Column(name="WORKPHONE")
	private String workPhone;
	@Column(name="CUSTOMEREMAIL")
	private String customerEmail;
	@Column(name="OPENINGBALANCE")
	private Float openingBalance;
	@Column(name="TAXTREATMENT")
	private String taxTreatment;
	@Column(name="CREDIT_LIMIT_BY")
	private String creditLimitBy;
	@Column(name="BANKNAME")
	private String bankName;
	@Column(name="IBAN")
	private String iBan;
	@Column(name="BANKROUTINGCODE")
	private String bankRoutingCode;
	@Column(name="SHIPCONTACTNAME")
	private String shipContactName;
	@Column(name="SHIPDESGINATION")
	private String shipDesignation;
	@Column(name="SHIPWORKPHONE")
	private String shipWorkPhone;
	@Column(name="SHIPHPNO")
	private String ShipHpNo;
	@Column(name="SHIPEMAIL")
	private String ShipEmail;
	@Column(name="SHIPCOUNTRY_CODE")
	private String ShipCountryCode;
	@Column(name="SHIPADDR1")
	private String ShipAddr1;
	@Column(name="SHIPADDR2")
	private String ShipAddr2;
	@Column(name="SHIPADDR3")
	private String ShipAddr3;
	@Column(name="SHIPADDR4")
	private String ShipAddr4;
	@Column(name="SHIPSTATE")
	private String shipState;
	@Column(name="SHIPZIP")
	private String shipZip;

}