package com.integration.general.persistence.models;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity @Table(name="##plant##INVMST")
@Getter @Setter
public class InvMst {
	@Column(name="PLANT")
	private String plant;
	@Column(name="ITEM")
	private String item;
	@Column(name="LOC")
	private String location;
	@Column(name="STATUS")
	private String status;
	@Column(name="SLED")
	private String sLed;
	@Column(name="QED")
	private String qed;
	@Column(name="STKTYPE")
	private String stackType;
	@Column(name="QTY")
	private Float quantity;
	@Column(name="QTYALLOC")
	private Float quantityAllocation;
	@Column(name="CRAT")
	private String crAt;
	@Column(name="CRBY")
	private String crBy;
	@Column(name="UPAT")
	private String upAt;
	@Column(name="UPBY")
	private String upBy;
	@Column(name="EXPIREDATE")
	private String expireDate;
	@Column(name="RECSTAT")
	private String recStatus;
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
	private Float userDblSix;
	@Column(name="IsActive")
	private String isActive;
	@Column(name="PRINTSTATUS")
	private String printStatus;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private Integer id;
}