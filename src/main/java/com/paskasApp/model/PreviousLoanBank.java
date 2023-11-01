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
public class PreviousLoanBank {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int branchId;
	public String branchName;
	public String ifscCode;
	public long contactNo;

}
