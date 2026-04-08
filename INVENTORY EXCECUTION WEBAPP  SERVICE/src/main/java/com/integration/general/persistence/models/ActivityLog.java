package com.integration.general.persistence.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity @Table(name="##plant##MOVHIS")
@Getter @Setter
public class ActivityLog {
    @Column(name="PLANT")
    private String plant;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID")
    private Integer id;
    @Column(name="DIRTYPE")
    private String dirType;
    @Column(name="RECID")
    private String recId;
    @Column(name="LNNO")
    private String lnNo;
    @Column(name = "MOVTID")
    private String movTid;
    @Column(name = "JOBNUM")
    private String jobNum;
    @Column(name = "ORDNUM")
    private String ordNum;
    @Column(name = "CUSTNO")
    private String custNo;
    @Column(name = "CUSTOMER")
    private String customer;
    @Column(name = "TRANDATE")
    private String transactionDate;
    @Column(name = "PONO")
    private String poNo;
    @Column(name = "PSTDT")
    private String pstDt;
    @Column(name = "ITEM")
    private String item;
    @Column(name = "CLASS")
    private String classVal;
    @Column(name = "ATTRIB")
    private String attRib;
    @Column(name = "ATTDESC")
    private String attDesc;
    @Column(name="VENDNO")
    private String vendNo;
    @Column(name="QTY")
    private Double qty;
    @Column(name="QTYPA")
    private Double qtyPa;
    @Column(name="BATNO")
    private String batNo;
    @Column(name="VENDBAT")
    private String vendBat;
    @Column(name="UOM")
    private String uom;
    @Column(name="SERNO")
    private String serNo;
    @Column(name="SLED")
    private String sled;
    @Column(name="STATUS")
    private String status;
    @Column(name="WHID")
    private String whId;
    @Column(name="LOC")
    private String loc;
    @Column(name="DEFBIN")
    private String defBin;
    @Column(name="ASGMTNO")
    private String asgmtNo;
    @Column(name="ASGMTDESC")
    private String asgmtDesc;
    @Column(name="ASGMTCAT")
    private String asgmtCat;
    @Column(name="CRAT")
    private String crAt;
    @Column(name="CRBY")
    private String crBy;
    @Column(name="UPAT")
    private String upAt;
    @Column(name="UPBY")
    private String upBy;
    @Column(name="REMARKS")
    private String remarks;
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
    @Column(name="USERFLD5")
    private String userFldFive;
    @Column(name="USERFLD6")
    private String userFldSix;
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
    private Float userDblSix= (float) 0;

}