package com.smartdocs.controller;

import java.time.LocalDate;
import java.time.ZonedDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.smartdocs.model.MyModel;
import com.smartdocs.service.MyService;

@RestController
@RequestMapping("/api")
public class MyController {
	
	@Autowired
	private MyService myService;
	
	@PostMapping("/create")
	public MyModel createProject(@RequestBody MyModel model){
		MyModel model2=myService.createProject(model);
		return model2;
	}
	@PutMapping("/updateLocalDate")
	public MyModel updateLocalDate(@RequestParam String id,@RequestParam LocalDate d)
	{
	     return this.myService.postDateLocal(id,d);
	}
	@PutMapping("/updateAmount")
	public MyModel updateAmount(@RequestParam String id,@RequestParam Double amt)
	{
	     return this.myService.postAmount(id,amt);
	}
	@PutMapping("/updateAtch")
	public MyModel updateAtch(@RequestParam String id,@RequestParam String stch)
	{
	     return this.myService.postAttachment(id,stch);
	}
	
	@GetMapping("/getDate/{id}")
	public LocalDate getDate(@PathVariable String id)
	{
		return this.myService.getDate(id);
	}
	@GetMapping("/getAmount/{id}")
	public Double getamount(@PathVariable String id)
	{
		return this.myService.getAmount(id);
	}
	@GetMapping("/getBillRef/{id}")
	public String getBillref(@PathVariable String id)
	{
		return this.myService.getbillref(id);
	}

}
