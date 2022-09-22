package com.smartdocs.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartdocs.model.MyModel;
import com.smartdocs.repo.MyRepo;

@Service
public class MyService implements MyServiceInt{

	@Autowired MyRepo myRepo;


	@Override
	public MyModel postDateLocal(String uid, LocalDate dateTime) {
		Optional<MyModel> optional=this.myRepo.findById(uid);	
		MyModel model=optional.get();
		model.setDateLocal(dateTime);
		this.myRepo.save(model);
		return model;
	}

	

	@Override
	public MyModel postAmount(String uid,Double d) {
		Optional<MyModel> optional=this.myRepo.findById(uid);	
		MyModel model=optional.get();
		model.setAmount(d);
		this.myRepo.save(model);
		return model;
	}

	@Override
	public MyModel postAttachment(String uid,String atch) {
		Optional<MyModel> optional=this.myRepo.findById(uid);	
		MyModel model=optional.get();
		model.setAttachment(atch);
		this.myRepo.save(model);
		return model;
	}

	@Override
	public LocalDate getDate(String id) {
		Optional<MyModel> optional=this.myRepo.findById(id);	
		return optional.get().getDateLocal();
	}

	@Override
	public double getAmount(String id) {
		Optional<MyModel> optional=this.myRepo.findById(id);	
		return optional.get().getAmount();
	}

	@Override
	public String getbillref(String id) {
		Optional<MyModel> optional=this.myRepo.findById(id);	
		return optional.get().getBillref();
	}

	@Override
	public MyModel createProject(MyModel model) {
		MyModel m=this.myRepo.save(model);
		return m;
	}



	@Override
	public String getProjectid(String string) {
		// TODO Auto-generated method stub
		return null;
	}


	


 
}
