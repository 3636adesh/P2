package com.smartdocs.model;

import java.time.LocalDate;
import java.time.ZonedDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document
@NoArgsConstructor
@Setter
@Getter
public class MyModel {
	@Id
	private String projectid ;
	private LocalDate dateLocal;
	private String billref;
	private double amount ; 
	private String attachment;

}
