package com.integration.general.persistence.models;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity @Table(name="##plant##DODET_REMARKS") 
@Getter @Setter
public class DoDetRemarks {
	@Column(name="PLANT")
	private String plant;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_REMARKS")
	private int idRemarks;

	@Column(name="DONO")
	private String doNo;
	@Column(name="DOLNNO")
	private int doLineNo;
	@Column(name="ITEM")
	private String item;
	@Column(name="REMARKS")
	private String remarks;
	@Column(name="CRAT")
	private String crAt;
	@Column(name="CRBY")
	private String crBy;
	@Column(name="UPAT")
	private String upAt;
	@Column(name="UPBY")
	private String upBy;
}