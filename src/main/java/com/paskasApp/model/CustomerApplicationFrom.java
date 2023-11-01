package com.paskasApp.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerApplicationFrom {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long customerId;
	public String customerName;
	public long customerMobileNo;
	public String customerEmail;
	public long customerAadharno;
	public String customerPancardno;
	public String gender;
	public String dateOfBirth;
	public Double totalLoanRequried;
	@OneToOne(cascade = CascadeType.ALL)
	public CibilScore cibilScore;
	@OneToOne(cascade = CascadeType.PERSIST)
	public CustomerDocuments customerDocuments;
	@OneToOne(cascade = CascadeType.ALL)
	public CustomerAccountDetails customerAccountDetails;
	@OneToOne(cascade = CascadeType.ALL)
	public GuarantorName guarantorName;
	@OneToOne(cascade = CascadeType.ALL)
	public LoanDisbursement loanDisburstment;
	@OneToOne(cascade = CascadeType.ALL)
	public Ledger ledger;
	@OneToOne(cascade = CascadeType.ALL)
	public SanctionLetter sanctionLetter;
	@OneToOne(cascade = CascadeType.ALL)
	public CustomerVerification customerVerification;
	@OneToOne(cascade = CascadeType.ALL)
	public PreviousLoan previousLoan;
	@OneToOne(cascade = CascadeType.ALL)
	public Address customerAddress;
;

	

}
