package com.integration.general.persistence.models;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity @Table(name="##plant##FINJOURNALHDR") 
@Getter @Setter
public class FinJournalHdr {
	@Column(name="PLANT")
	private String plant;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	@Column(name="JOURNAL_DATE")
	private String journalDate;
	@Column(name="REFERENCE")
	private String reference;
	@Column(name="NOTE")
	private String note;
	@Column(name="CURRENCYID")
	private String currencyId;
	@Column(name="JOURNAL_TYPE")
	private String journalType;
	@Column(name="JOURNAL_STATUS")
	private String journalStatus;
	@Column(name="TRANSACTION_ID")
	private String transactionId;
	@Column(name="TRANSACTION_TYPE")
	private String transactionType;
	@Column(name="SUB_TOTAL")
	private float subTotal;
	@Column(name="TOTAL_AMOUNT")
	private float totalAmount;
	@Column(name="CRAT")
	private String crAt;
	@Column(name="CRBY")
	private String crBy;
	@Column(name="UPAT")
	private String upAt;
	@Column(name="UPBY")
	private String upBy;
}