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
public class SanctionLetter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long sanctionId;
	public String sanctionDate;
	public String applicantName;
	public String contactDetails;
	public Double loanAmountSanctioned;
	public float rateOfInterest;
	public Double monthlyEmiAmount;
	public String modeOfPayment;


}
