package com.integration.general.persistence.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "##plant##PRD_CLASS_MST")
@Getter
@Setter
public class PrdClassMaster {
    @Column(name = "PLANT")
    private String plant;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "PRD_CLS_ID")
    private String prdClsId;
    @Column(name = "PRD_GRP_ID")
    private String prdGrpId;
    @Column(name = "PRD_CLS_DESC")
    private String prdClsDesc;
    @Column(name = "PRD_CLS_DESC1")
    private String prdClsDescOne;
    @Column(name = "PRICE")
    private String price;
    @Column(name = "KFACTOR")
    private int kFactor;
    @Column(name = "CRAT")
    private String crAt;
    @Column(name = "CRBY")
    private String crBy;
    @Column(name = "UPAT")
    private String upAt;
    @Column(name = "UPBY")
    private String upBy;
    @Column(name = "UOM")
    private String uom;
    @Column(name = "QTY_PER_COLUMN")
    private String qtyPerColumn;
    @Column(name = "NO_OF_COLUMN")
    private String noOfColumn;
    @Column(name = "QTY_PER_TRAY")
    private String qtyPerTray;
    @Column(name = "NO_OF_TRAY_PER_LAYER")
    private String noOfTrayPerLayer;
    @Column(name = "NO_OF_LAYERS")
    private String noOfLayers;
    @Column(name = "NO_OF_LAYERS_PER_PALLET")
    private String noOfLayersPerPallet;
    @Column(name = "IsActive")
    private String isActive;
    @Column(name = "CATLOGPATH")
    private String catalogPath;
}