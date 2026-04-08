package com.integration.general.persistence.models;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity @Table(name="##plant##PODET_REMARKS")
@Getter @Setter
public class PoDetRemarks {
	@Column(name="PLANT")
	private String plant;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_REMARKS")
	private int idRemarks;
	@Column(name="PONO")
	private String poNo;
	@Column(name="POLNNO")
	private int poLineNo;
	@Column(name="ITEM")
	private String item;
	@Column(name="REMARKS")
	private String reMarks;
	@Column(name="CRAT")
	private String crAt;
	@Column(name="CRBY")
	private String crBy;
	@Column(name="UPAT")
	private String upAt;
	@Column(name="UPBY")
	private String upBy;
	@Column(name ="UKEY")
	private String uniqueKey;
}