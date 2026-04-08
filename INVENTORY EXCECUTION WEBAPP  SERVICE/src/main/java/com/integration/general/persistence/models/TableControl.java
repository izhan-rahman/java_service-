package com.integration.general.persistence.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "##plant##TBLCONTROL")
@Getter
@Setter
public class    TableControl {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "PLANT")
    private String plant;
    @Column(name = "FUNC")
    private String func;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "PREFIX")
    private String prefix;
    @Column(name = "MINSEQ")
    private String minSeq;
    @Column(name = "MAXSEQ")
    private String maxSeq;
    @Column(name = "NXTSEQ")
    private String nxtSeq;
    @Column(name = "FORMAT")
    private String format;
    @Column(name = "POSTFIX")
    private String postFix;
    @Column(name = "COMMENT1")
    private String commentOne;
    @Column(name = "COMMENT2")
    private String commentTwo;
    @Column(name = "CRAT")
    private String crAt;
    @Column(name = "CRBY")
    private String crBy;
    @Column(name = "UPAT")
    private String upAt;
    @Column(name = "UPBY")
    private String upBy;
    @Column(name = "RECSTAT")
    private String recStat;
    @Column(name = "USERFLD1")
    private String userFieldOne;
    @Column(name = "USERFLD2")
    private String userFieldTwo;
    @Column(name = "USERFLD3")
    private String userFieldThree;
    @Column(name = "USERFLD4")
    private String userFieldFour;
    @Column(name = "USERFLD5")
    private String userFieldFive;
    @Column(name = "USERFLD6")
    private String userFieldSix;
    @Column(name = "USERFLG1")
    private String userFlagOne;
    @Column(name = "USERFLG2")
    private String userFlagTwo;
    @Column(name = "USERFLG3")
    private String userFlagThree;
    @Column(name = "USERFLG4")
    private String userFlagFour;
    @Column(name = "USERFLG5")
    private String userFlagFive;
    @Column(name = "USERFLG6")
    private String userFlagSix;
    @Column(name = "USERTIME1")
    private String userTimeOne;
    @Column(name = "USERTIME2")
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
}