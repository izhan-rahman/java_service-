package com.integration.general.persistence.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "##plant##PRD_TYPE_MST")
@Getter
@Setter
public class PrdTypeMaster {
    @Column(name = "PLANT")
    private String plant;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "PRD_TYPE_ID")
    private String prdTypeId;
    @Column(name = "PRD_TYPE_DESC")
    private String prdTypeDesc;
    @Column(name = "COMMENTS1")
    private String commentsOne;
    @Column(name = "COMMENTS2")
    private String commentsTwo;
    @Column(name = "CRAT")
    private String crAt;
    @Column(name = "CRBY")
    private String crBy;
    @Column(name = "UPAT")
    private String upAt;
    @Column(name = "UPBY")
    private String upBy;
    @Column(name = "RECSTAT")
    private String RecStat;
    @Column(name = "USERFLD1")
    private String userFldOne;
    @Column(name = "USERFLD2")
    private String userFldTwo;
    @Column(name = "USERFLD3")
    private String userFldThree;
    @Column(name = "USERFLD4")
    private String userFldFour;
    @Column(name = "USERFLD5")
    private String userFldFive;
    @Column(name = "USERFLD6")
    private String userFldSix;
    @Column(name = "USERFLG1")
    private String userFlgOne;
    @Column(name = "USERFLG2")
    private String userFlgTwo;
    @Column(name = "USERFLG3")
    private String userFlgThree;
    @Column(name = "USERFLG4")
    private String userFlgFour;
    @Column(name = "USERFLG5")
    private String userFlgFive;
    @Column(name = "USERFLG6")
    private String userFlgSix;
    @Column(name = "USERTIME1")
    private String userTimeOne;
    @Column(name = "USERTIME2")
    private String userTimeTwo;
    @Column(name = "USERTIME3")
    private String userTimeThree;
    @Column(name = "USERDBL1")
    private float userDblOne;
    @Column(name = "USERDBL2")
    private float userDblTwo;
    @Column(name = "USERDBL3")
    private float userDblThree;
    @Column(name = "USERDBL4")
    private float userDblFour;
    @Column(name = "USERDBL5")
    private float userDblFive;
    @Column(name = "USERDBL6")
    private float userDblSix;
    @Column(name = "IsActive")
    private String isActive;
}