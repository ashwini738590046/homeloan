
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
public class CibilScore {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long cibilId;
	public int cibilScore;
	public String cibilScoreDate;
	public String status;


}
