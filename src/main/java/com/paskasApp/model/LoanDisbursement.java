package com.paskasApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoanDisbursement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long loanNumber;
	public String aggrementDate;
	public String amountPayType;
	public Double totalAmount;
	public String bankName;
	public long accountNumber;
	public Double transferdAmount;
	public String paymentStatus;
	public String amountPaidDate;

	

}
