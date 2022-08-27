package com.example.MyApp;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class MyController {
	
	//private Model Model;
    
	@Autowired
	Myservice my;
	
	@RequestMapping(path="/Hello")
	public List<Data> sayHello() {
		return my.getdata();
	    
	}
	
	@RequestMapping(path="/get/{id}")
	public Data giveme(@PathVariable String id) {
	
		return my.get_that_data(id);
	}
	
	
	@RequestMapping( method=RequestMethod.POST ,value="/Hello")
	public void addtopic(@RequestBody Data data) {
	
		my.addData(data);
	
	}
	
	
	@RequestMapping( method=RequestMethod.PATCH ,value="/Hello")
	public void updatetopicc(@RequestBody Data data) {
	
		my.addData(data);
	
	}
	
	@RequestMapping( method=RequestMethod.DELETE ,value="/Hello")
	public void deletetopicc(@RequestBody Data data) {
	
		my.addData(data);
	
	}
	
	
	
	
	
}


