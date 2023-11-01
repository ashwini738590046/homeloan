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
public class PreviousLoan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long previousLoanId;
	public Double previousLoanAmount;
	public Double paidAmount;
	public Double remainingAmount;
	public int defaulterCount;
	public String loanStatus;
	@OneToOne(cascade = CascadeType.ALL)
	public PreviousLoanBank previousBankDetails;


}
