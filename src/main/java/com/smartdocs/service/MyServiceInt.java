package com.smartdocs.service;

import java.time.LocalDate;
import java.time.ZonedDateTime;

import com.smartdocs.model.MyModel;

public interface MyServiceInt {
	 MyModel createProject(MyModel myModel);
	

	 MyModel postDateLocal(String uid,LocalDate dateTime);
	 MyModel postAmount(String uid,Double amt);
	 MyModel postAttachment(String uid,String string);
	 
	 LocalDate getDate(String string);
	 String getProjectid(String string);
	 double getAmount(String string);
	 String getbillref(String string);
	 
	 

}
