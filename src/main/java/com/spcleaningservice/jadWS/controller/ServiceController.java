package com.spcleaningservice.jadWS.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spcleaningservice.jadWS.dbaccess.*;



@RestController
//@RequestMapping ("services")

public class ServiceController {
	
	@RequestMapping(method=RequestMethod.GET, path="/service/{cat}")
	public ArrayList<Service> listServiceByCat(@PathVariable("cat") String cat){
		ArrayList<Service> myList = new ArrayList<>();
		try {
			ServiceDAO db = new ServiceDAO();
            myList = db.getServiceByCat(cat);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return myList;
	}

}
