package com.integration.general.persistence.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.*;


@Entity
@Table(name="##plant##CUSTOMER_TYPE_MST")
@Getter
@Setter
public class CustomerType {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;
    @Column(name="PLANT")
    private String plant;
    @Column(name="CUSTOMER_TYPE_ID")
    private String customerTypeId;
    @Column(name="CUSTOMER_TYPE_DESC")
    private String customerTypeDesc;
    @Column(name="COMMENTS1")
    private String commentsOne;
    @Column(name="COMMENTS2")
    private String commentsTwo;
    @Column(name="CRAT")
    private String crAt;
    @Column(name="CRBY")
    private String crBy;
    @Column(name="UPAT")
    private String upAt;
    @Column(name="UPBY")
    private String upBy;
    @Column(name="IsActive")
    private String isActive;
}