package com.example.MyApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class Myservice {

	
	List<Data> d1= new ArrayList<>(Arrays.asList(
			
			
			new Data("1","shreyash"),
			new Data("2","yash"),
			new Data("3","rohan"),
			new Data("4","rohit")
			));
	
	
	
	public List<Data> getdata(){
		return d1;
	}
	
	
	
	public Data   get_that_data(String id){
	  return  d1.stream().filter(i->i.getId().equals(id)).findFirst().get();
	
	}
	
	



	public void addData(Data data) {
	 
	  d1.add(data);	
	}

	 ListIterator<Data> it=d1.listIterator();

	public void updatetopicc(Data data) {
		 
   int value=  d1.stream().filter(i->i.getId().equals(data)).findFirst().hashCode();
     
     d1.set(value, data);
     
		 
		  
		  
		}	
	
	public void deletetopicc(Data data) {
		 
		   int value=  d1.stream().filter(i->i.getId().equals(data)).findFirst().hashCode();
		     
		     d1.remove(value);
		     
				 
				  
				  
				}	
}
