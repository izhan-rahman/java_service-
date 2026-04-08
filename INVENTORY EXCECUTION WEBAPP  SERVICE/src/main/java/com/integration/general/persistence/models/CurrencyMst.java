package com.integration.general.persistence.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity @Table(name="##plant##CURRENCYMST") 
@Getter @Setter
public class CurrencyMst {
	@Column(name="PLANT")
	private String plant;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CURRENCYID")
	private String currencyId;
	@Column(name="DESCRIPTION")
	private String description;
	@Column(name="DISPLAY")
	private String display;
	@Column(name="CURRENCYUSEQT")
	private String currencyUseQt;
	@Column(name="REMARK")
	private String remark;
	@Column(name="STATUS")
	private String status;
	@Column(name="CRAT")
	private String crAt;
	@Column(name="CRBY")
	private String crBy;
	@Column(name="UPAT")
	private String upAt;
	@Column(name="UPBY")
	private String upBy;
	@Column(name="USERFLD1")
	private String userFieldOne;
	@Column(name="USERFLD2")
	private String userFieldTwo;
	@Column(name="USERFLD3")
	private String userFieldThree;
	@Column(name="USERFLD4")
	private String userFieldFour;
	@Column(name="USERFLD5")
	private String userFieldFive;
	@Column(name="USERFLD6")
	private String userFieldSix;
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
	private Float userDblSix = (float) 0;
	@Column(name = "ISACTIVE")
	private String isActive;
}