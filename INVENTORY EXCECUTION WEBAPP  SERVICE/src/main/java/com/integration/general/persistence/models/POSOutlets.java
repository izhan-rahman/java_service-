package com.integration.general.persistence.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="##plant##POSOUTLETS")
@Getter
@Setter
public class POSOutlets {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ID")
    private int ID;
    @Column(name="PLANT")
    private String PLANT;
    @Column(name="OUTLET")
    private String OUTLET;
    @Column(name="OUTLET_NAME")
    private String OUTLET_NAME;
    @Column(name="CONTACT_PERSON")
    private String CONTACT_PERSON;
    @Column(name="DESGINATION")
    private String DESGINATION;
    @Column(name="ADD1")
    private String ADD1;
    @Column(name="ADD2")
    private String ADD2;
    @Column(name="ADD3")
    private String ADD3;
    @Column(name="ADD4")
    private String ADD4;
    @Column(name="COUNTRY")
    private String COUNTRY;
    @Column(name="STATE")
    private String STATE;
    @Column(name="ZIP")
    private String ZIP;
    @Column(name="TELNO")
    private String TELNO;
    @Column(name="HPNO")
    private String HPNO;
    @Column(name="FAX")
    private String FAX;
    @Column(name="EMAIL")
    private String EMAIL;
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
}
