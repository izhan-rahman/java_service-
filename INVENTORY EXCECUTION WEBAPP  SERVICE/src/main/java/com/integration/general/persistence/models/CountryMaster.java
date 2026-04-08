package com.integration.general.persistence.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="COUNTRYMASTER")
@Getter
@Setter
public class CountryMaster {
    @Column(name="PLANT")
    private String plant;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;
    @Column(name="COUNTRY_CODE")
    private String countryCode;
    @Column(name="COUNTRYNAME")
    private String countryName;
    @Column(name="PHONE_CODE")
    private String phoneCode;
    @Column(name="CAPITAL")
    private String capital;
    @Column(name="CURRENCY")
    private String currency;
    @Column(name="REGION")
    private String region;
    @Column(name="CRAT")
    private String crAt;
    @Column(name="CRBY")
    private String crBy;
    @Column(name="UPAT")
    private String upAt;
    @Column(name="UPBY")
    private String upBy;
}
