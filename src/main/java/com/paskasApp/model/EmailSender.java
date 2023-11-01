package com.paskasApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmailSender {
	private String to;
	private String from;
	private String subject;
	private String textBodyMsg;

}
