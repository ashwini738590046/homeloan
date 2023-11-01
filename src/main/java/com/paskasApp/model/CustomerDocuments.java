package com.paskasApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDocuments {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long customerDocId;
	@Lob
	public byte[] customerPhoto;
	@Lob
	public byte[] customerSign;
	@Lob
	public byte[] customerPancard;
	@Lob
	public byte[] customerAadharcard;


}
