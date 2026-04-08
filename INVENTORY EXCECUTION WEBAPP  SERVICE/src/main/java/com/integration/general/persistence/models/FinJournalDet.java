package com.integration.general.persistence.models;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity @Table(name="##plant##FINJOURNALDET") 
@Getter @Setter
public class FinJournalDet {
	@Column(name="PLANT")
	private String plant;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	@Column(name="LNNO")
	private int lnNo;
	@Column(name="JOURNALHDRID")
	private int journalHdrId;
	@Column(name="ACCOUNT_NAME")
	private String accountName;
	@Column(name="DESCRIPTION")
	private String description;
	@Column(name="DEBITS")
	private float debits;
	@Column(name="CREDITS")
	private float credits;
	@Column(name="OPENINGBALANCEDEBITS")
	private float openingBalanceDebits;
	@Column(name="OPENINGBALANCECREDITS")
	private float openingBalanceCredits;
	@Column(name="CLOSINGBALANCEDEBITS")
	private float closingBalanceDebits;
	@Column(name="CLOSINGBALANCECREDITS")
	private float closingBalanceCredits;
	@Column(name="CRAT")
	private String crAt;
	@Column(name="CRBY")
	private String crBy;
	@Column(name="UPAT")
	private String upAt;
	@Column(name="UPBY")
	private String upBy;
	@Column(name="ACCOUNT_ID")
	private int accountId;
	@Column(name="RECONCILIATION")
	private int reconciliation;
	@Column(name="BANKDATE")
	private String bankDate;
}