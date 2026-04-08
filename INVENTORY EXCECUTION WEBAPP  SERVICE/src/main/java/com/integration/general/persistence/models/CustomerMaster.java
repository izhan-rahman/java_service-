package com.integration.general.persistence.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="##plant##CUSTMST")
@Getter
@Setter
public class CustomerMaster {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID")
    private int Id;
    @Column(name="PLANT")
    private String plant;
    @Column(name="CUSTNO")
    private String custNo;
    @Column(name="CUSTDESC")
    private String custDesc;
    @Column(name="COMMENT1")
    private String commentOne;
    @Column(name="ACTIVEF")
    private String activeF;
    @Column(name="CNAME")
    private String custName;
    @Column(name="LNAME")
    private String lastName;
    @Column(name="NAME")
    private String name;
    @Column(name="DESGINATION")
    private String desgination;
    @Column(name="TELNO")
    private String telNo;
    @Column(name="HPNO")
    private String hpNo;
    @Column(name="FAX")
    private String fax;
    @Column(name="EMAIL")
    private String email;
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
    @Column(name="REMARKS")
    private String remarks;
    @Column(name="ZIP")
    private String zip;
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
    @Column(name="USERFLD1")
    private String userFldOne;
    @Column(name="USERFLD2")
    private String userFldTwo;
    @Column(name="USERFLD3")
    private String userFldThree;
    @Column(name="USERFLD4")
    private String userFldFour;
    @Column(name="USERFLG1")
    private String userFlgOne;
    @Column(name="USERFLG2")
    private String userFlgTwo;
    @Column(name="USERFLG3")
    private String userFlgThree;
    @Column(name="USERFLG4")
    private String userFlgFour;
    @Column(name="USERFLG5")
    private String userFlgFive;
    @Column(name="USERFLG6")
    private String userFlgSix;
    @Column(name="USERTIME1")
    private String userTimeOne;
    @Column(name="USERTIME2")
    private String userTimeTwo;
    @Column(name = "USERTIME3")
    private String userTimeThree;
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
    @Column(name = "IsActive")
    private String isActive;
    @Column(name="NONSTKFLAG")
    private String nonStkFlag;
    @Column(name="NONSTKTYPEID")
    private String nonStkTypeId;
    @Column(name="PASSWORD")
    private String password;
    @Column(name="USER_ID")
    private String userId;
    @Column(name="PAYMENTMODE")
    private String paytmentMode;
    @Column(name="ISMEMBER")
    private String isMember;
    @Column(name="GENDER")
    private String gender;
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
    private float creditLimit;
    @Column(name="ISCREDITLIMIT")
    private String isCreditLimit;
    @Column(name="SKYPEID")
    private String skypeId;
    @Column(name="FACEBOOKID")
    private String facebookId;
    @Column(name="TWITTERID")
    private String twitterId;
    @Column(name="LINKEDINID")
    private String linkedId;
    @Column(name="WORKPHONE")
    private String workPhone;
    @Column(name = "CUSTOMEREMAIL")
    private String customerEmail;
    @Column(name = "OPENINGBALANCE")
    private Float openingBalance;
    @Column(name = "TAXTREATMENT")
    private String taxTreatment;
    @Column(name="CREDIT_LIMIT_BY")
    private String creditLimitBy;
    @Column(name="BANKNAME")
    private String bankName;
    @Column(name="IBAN")
    private String iban;
    @Column(name="BANKROUTINGCODE")
    private String bankRoutingCode;
    @Column(name="COMPANYREGNUMBER")
    private String companyRegNumber;
}
