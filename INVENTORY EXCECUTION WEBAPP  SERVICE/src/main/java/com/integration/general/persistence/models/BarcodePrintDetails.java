package com.integration.general.persistence.models;


import lombok.Getter;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.*;

@Entity
@Table(name="##plant##BARCODEPRINTDETAILS")
@Getter
@Setter
public class BarcodePrintDetails {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="PRINTID")
    private int printId;
    @Column(name="PLANT")
    private String plant;
    @Column(name="LABEL_TYPE")
    private String labelType;
    @Column(name="LABEL_WIDTH")
    private int labelWidth;
    @Column(name="LABEL_HEIGHT")
    private int labelHeight;
    @Column(name="BARCODE_WIDTH")
    private int barcodeWidth;
    @Column(name="BARCODE_HEIGHT")
    private int barcodeHeight;
    @Column(name="FONT_SIZE")
    private int fontSize;
    @Column(name="TEXT_ALIGN")
    private String textAlign;
    @Column(name="TEXT_POSITION")
    private String textPosition;
    @Column(name="DISPLAY_BARCODE_TEXT")
    private String displayBarcodeText;
    @Column(name="PRINT_COUNT")
    private int printCount;
    @Column(name="PRICE_LABEL_TEXT")
    private String priceLabelText;
    @Column(name="PAGE_TYPE")
    private String pageType;
    @Column(name="CRAT")
    private String crAt;
    @Column(name="CRBY")
    private String crBy;
    @Column(name="UPAT")
    private String upAt;
    @Column(name="UPBY")
    private String upBy;

}
