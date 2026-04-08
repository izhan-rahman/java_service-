package com.integration.general.persistence.models;

import io.swagger.models.auth.In;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PLNTMST")
@Getter @Setter
public class PlantMst {
    @Id
    @Column(name="PLANT")
    private String plant;
    @Column(name="PLNTDESC")
    private String plantDesc;
    @Column(name="STARTDATE")
    private String startDate;
    @Column(name="EXPIRYDATE")
    private String expiryDate;
    @Column(name="ACTEXPIRYDATE")
    private String actExpiryDate;
    @Column(name="NAME")
    private String name;
    @Column(name="DESGINATION")
    private String designation;
    @Column(name="TELNO")
    private String telNo;
    @Column(name="HPNO")
    private String hpNo;
    @Column(name="EMAIL")
    private String email;
    @Column(name="ADD1")
    private String add1;
    @Column(name="ADD2")
    private String add2;
    @Column(name="ADD3")
    private String add3;
    @Column(name="ADD4")
    private String add4;
    @Column(name="COUNTY")
    private String country;
    @Column(name="ZIP")
    private String zip;
    @Column(name="AUTHSTAT")
    private String authStat;
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
    private String userFld1;
    @Column(name="USERFLD2")
    private String userFld2;
    @Column(name="RCBNO")
    private String rcbNo;
    @Column(name="WEBSITE")
    private String website;
    @Column(name="GSTREGNO")
    private String gstRegNo;
    @Column(name="NUMBER_OF_CATALOGS")
    private String numberOfCatalogs;
    @Column(name="SALES_CHARGE_BY")
    private String salesChargeBy;
    @Column(name="SALES_PERCENT")
    private float salesPercent;
    @Column(name="SALES_FR_DOLLARS")
    private int salesForDollars;
    @Column(name="SALES_FR_CENTS")
    private int salesForCents;
    @Column(name="ENQUIRY_FR_DOLLARS")
    private int enquiryForDollars;
    @Column(name="ENQUIRY_FR_CENTS")
    private int enquiryForCents;
    @Column(name="BASE_CURRENCY")
    private String baseCurrency;
    @Column(name="MNTEXPIRYDATE")
    private String mntExpiryDate;
    @Column(name="NUMBER_OF_SIGNATURES")
    private String numberOfSignatures;
    @Column(name="APIKEY")
    private String apiKey;
    @Column(name="TAXBY")
    private String taxBy;
    @Column(name="STATE")
    private String state;
    @Column(name="ENABLE_INVENTORY")
    private int enableInventory;
    @Column(name="ENABLE_ACCOUNTING")
    private int enableAccounting;
    @Column(name="TAXBYLABEL")
    private String taxByLabel;
    @Column(name="TAXBYLABELORDERMANAGEMENT")
    private String taxByLabelOrderManagement;
    @Column(name="NUMBEROFDECIMAL")
    private int numberOfDecimal;
    @Column(name="ISTAXREGISTRED")
    private int isTaxRegistered;
    @Column(name="REPROTSBASIS")
    private String reportBasis;
    @Column(name="REGION")
    private String region;
    @Column(name="FISCAL_YEAR")
    private String fiscalYear;
    @Column(name="PAYROLL_YEAR")
    private String payrollYear;
    @Column(name="ENABLE_PAYROLL")
    private int enablePayroll;
    @Column(name="SKYPEID")
    private String skypeId;
    @Column(name="FACEBOOKID")
    private String facebookId;
    @Column(name="TWITTERID")
    private String twitterId;
    @Column(name="LINKEDINID")
    private String linkedInId;
    @Column(name="ID")
    private int id;
    @Column(name="EMPLOYEEWORKINGMANDAYSBY")
    private String employeeWorkingManDaysBy;
    @Column(name="SEALNAME")
    private String sealName;
    @Column(name="SIGNATURENAME")
    private String signatureName;
    @Column(name="NUMBER_OF_SUPPLIER")
    private String numberOfSupplier;
    @Column(name="NUMBER_OF_CUSTOMER")
    private String numberOfCustomer;
    @Column(name="NUMBER_OF_EMPLOYEE")
    private String numberOfEmployee;
    @Column(name="NUMBER_OF_INVENTORY")
    private String numberOfInventory;
    @Column(name="NUMBER_OF_LOCATION")
    private String numberOfLocation;
    @Column(name="COMPANYREGNUMBER")
    private String companyRegNumber;
    @Column(name="NUMBER_OF_PAYMENT")
    private String numberOfPayment;
    @Column(name="NUMBER_OF_JOURNAL")
    private String numberOfJournal;
    @Column(name = "NUMBER_OF_CONTRA")
    private String numberOfContra;
    @Column(name = "SHOPIFY")
    private String shopify;
    @Column(name = "LAZADA")
    private String lazada;
    @Column(name = "SHOPEE")
    private String shopee;
    @Column(name = "AMAZON")
    private String amazon;

    @Column(name = "PRODUCT_SHOWBY_CATAGERY")
    private int productShowByCategory;

    @Column(name = "ISASSIGN_USERLOC")
    private int isAssignUserLoc;
    @Column(name = "ENABLE_POS")
    private int enablePos;
    @Column(name = "NUMBER_OF_EBIQI")
    private String numberOfEbiQi;
    @Column(name = "ISPOSTAXINCLUSIVE")
    private Short isPostTaxInclusive;



    @Column(name="APPPATH")
    private String appPath;
    @Column(name="COMP_INDUSTRY")
    private String compIndustry;
    @Column(name="ISAUTO_CONVERT_ESTPO")
    private Integer isAutoConvertEstpo;
    @Column(name="ISAUTO_CONVERT_SOINVOICE")
    private Integer isAutoConvertSoinvoice;
    @Column(name="ISACCESSOWNERAPP")
    private Integer isAccessOwnerapp;
    @Column(name="ISACCESSMANGERAPP")
    private Integer isAccessMangerapp;
    @Column(name="ISRIDERRAPP")
    private Integer isRiderrapp;
    @Column(name="ISACCESS_STOREAPP")
    private Integer isAccessStoreapp;
    @Column(name="ISACCESS_CUSTOMERAPP")
    private Integer isAccessCustomerapp;
    @Column(name="STATUS")
    private String status;
    @Column(name="REMARKS")
    private String remarks;
    @Column(name="PARTNER")
    private String partner;
    @Column(name="USERNAME")
    private String userName;
    @Column(name="ISAUTO_CONVERT_RECEIPTBILL")
    private Integer isAutoConvertReceiptbill;
    @Column(name="SHOW_STOCKQTY_ONAPP")
    private Integer showStockqtyOnapp;
    @Column(name="ISMANAGEWORKFLOW")
    private Integer isManageWorkFlow;
    @Column(name="ISPRODUCTMAXQTY")
    private Integer isProductMaxqty;
    @Column(name="ISPOSRETURN_TRAN")
    private Integer isPosReturnTran;
    @Column(name="ISPOSVOID_TRAN")
    private Integer isPosVoidTran;
    @Column(name="ISPEPPOL")
    private Integer isPeppol;
    @Column(name="PEPPOL_ID")
    private String peppolId;
    @Column(name="EXITPOINT")
    private String exitPoint;
    @Column(name="SHOW_POS_SUMMARY")
    private Integer showPosSummary;
    @Column(name="ISPOSSALESMAN_BYBILLPRODUCT")
    private Integer isPosSalesmanBybillproduct;
    @Column(name="ALLOWPRODUCT_TO_OTHERCOMPANY")
    private Integer allowProductToOtherCompany;
    @Column(name="PEPPOL_UKEY")
    private String peppolUkey;
    @Column(name="ISSHOWPOSPRICEBYOUTLET")
    private Integer isShowPosPriceByOutlet;
    @Column(name="ISSALESTOPURCHASE")
    private Integer isSalesToPurchase;
    @Column(name="ALLOWPOSTRAN_LESSTHAN_AVBQTY")
    private Integer allowPostranLessthanAvbqty;
    @Column(name="ISSALESAPP_TAXINCLUSIVE")
    private Integer isSalesappTaxinclusive;
    @Column(name="NUMBER_OF_USER")
    private String numberOfUser;
    @Column(name="SHOWITEM_AVGCOST")
    private Integer showItemAvgcost;
    @Column(name="ENABLE_RESERVEQTY")
    private Integer enableReserveqty;
    @Column(name="IsDefautDrawerAmount")
    private Integer isDefautDrawerAmount;








}
