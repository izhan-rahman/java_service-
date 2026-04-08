package com.integration.general.persistence.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "##plant##PRD_BRAND_MST")
@Getter
@Setter
public class PrdBrandMaster {
    @Column(name = "PLANT")
    private String plant;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "PRD_BRAND_ID")
    private String prdBrandId;
    @Column(name = "PRD_BRAND_DESC")
    private String prdBrandDesc;
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
    @Column(name = "IsActive")
    private String isActive;
    @Column(name = "CATLOGPATH")
    private String catalogPath;
}