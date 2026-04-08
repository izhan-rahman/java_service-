package com.integration.general.persistence.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="##plant##EMP_MST")
@Getter
@Setter
public class EmployeeMaster {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ID")
    private int ID;
    @Column(name="PLANT")
    private String PLANT;
    @Column(name="EMPNO")
    private String EMPNO;
    @Column(name="FNAME")
    private String FNAME;
    @Column(name="LNAME")
    private String LNAME;
    @Column(name="GENDER")
    private String GENDER;
    @Column(name="DATEOFBIRTH")
    private String DATEOFBIRTH;
    @Column(name="DEPTARTMENT")
    private String DEPTARTMENT;
    @Column(name="DESGINATION")
    private String DESGINATION;
    @Column(name="DATEOFJOINING")
    private String DATEOFJOINING;
    @Column(name="DATEOFLEAVING")
    private String DATEOFLEAVING;
    @Column(name="NATIONALITY")
    private String NATIONALITY;
    @Column(name="TELNO")
    private String TELNO;
    @Column(name="HPNO")
    private String HPNO;
    @Column(name="EMAIL")
    private String EMAIL;
    @Column(name="SKYPEID")
    private String SKYPEID;
    @Column(name="FACEBOOKID")
    private String FACEBOOKID;
    @Column(name="TWITTERID")
    private String TWITTERID;
    @Column(name="LINKEDINID")
    private String LINKEDINID;
    @Column(name="PASSPORTNUMBER")
    private String PASSPORTNUMBER;
    @Column(name="COUNTRYOFISSUE")
    private String COUNTRYOFISSUE;
    @Column(name="PASSPORTEXPIRYDATE")
    private String PASSPORTEXPIRYDATE;
    @Column(name="UNITNO")
    private String UNITNO;
    @Column(name="BUILDING")
    private String BUILDING;
    @Column(name="STREET")
    private String STREET;
    @Column(name="CITY")
    private String CITY;
    @Column(name="STATE")
    private String STATE;
    @Column(name="COUNTRY")
    private String COUNTRY;
    @Column(name="ZIP")
    private String ZIP;
    @Column(name="EMIRATESID")
    private String EMIRATESID;
    @Column(name="EMIRATESIDEXPIRY")
    private String EMIRATESIDEXPIRY;
    @Column(name="VISANUMBER")
    private String VISANUMBER;
    @Column(name="VISAEXPIRYDATE")
    private String VISAEXPIRYDATE;
    @Column(name="LABOURCARDNUMBER")
    private String LABOURCARDNUMBER;
    @Column(name="WORKPERMITNUMBER")
    private String WORKPERMITNUMBER;
    @Column(name="CONTRACTSTARTDATE")
    private String CONTRACTSTARTDATE;
    @Column(name="CONTRACTENDDATE")
    private String CONTRACTENDDATE;
    @Column(name="BANKNAME")
    private String BANKNAME;
    @Column(name="IBAN")
    private String IBAN;
    @Column(name="BANKROUTINGCODE")
    private String BANKROUTINGCODE;
    @Column(name="BASICSALARY")
    private Float BASICSALARY;
    @Column(name="HOUSERENTALLOWANCE")
    private Float HOUSERENTALLOWANCE;
    @Column(name="TRANSPORTALLOWANCE")
    private Float TRANSPORTALLOWANCE;
    @Column(name="COMMUNICATIONALLOWANCE")
    private Float COMMUNICATIONALLOWANCE;
    @Column(name="OTHERALLOWANCE")
    private Float OTHERALLOWANCE;
    @Column(name="BONUS")
    private Float BONUS;
    @Column(name="COMMISSION")
    private Float COMMISSION;
    @Column(name="REMARKS")
    private String REMARKS;
    @Column(name="CATLOGPATH")
    private String CATLOGPATH;
    @Column(name="IsActive")
    private String IsActive;
    @Column(name="CRAT")
    private String CRAT;
    @Column(name="CRBY")
    private String CRBY;
    @Column(name="UPAT")
    private String UPAT;
    @Column(name="UPBY")
    private String UPBY;
    @Column(name="NUMBEROFMANDAYS")
    private Float NUMBEROFMANDAYS;
    @Column(name="EMPLOYEETYPEID")
    private int EMPLOYEETYPEID;
    @Column(name="REPORTING_INCHARGE")
    private int REPORTING_INCHARGE;
    @Column(name="EMPUSERID")
    private String EMPUSERID;
    @Column(name="PASSWORD")
    private String PASSWORD;
    @Column(name="GRATUITY")
    private Float GRATUITY;
    @Column(name="AIRTICKET")
    private Float AIRTICKET;
    @Column(name="LEAVESALARY")
    private Float LEAVESALARY;
    @Column(name="ISAUTOEMAIL")
    private Short ISAUTOEMAIL;
    @Column(name="OUTLET")
    private String OUTLET;
    @Column(name="ISPOSCUSTOMER")
    private Short ISPOSCUSTOMER;
    @Column(name="ISEDITPOSPRODUCTPRICE")
    private Short ISEDITPOSPRODUCTPRICE;
}
