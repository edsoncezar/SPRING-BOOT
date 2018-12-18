package com.edson.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.edson.beans.City;

/**
 * 
 * @author edson
 *
 */
@Controller
public class HotelRetrieveController {
	
	@RequestMapping(value="http://localhost:8080/hotels/{id}")
	public ResponseEntity<City> getListOfHotel (@PathVariable("id") int id)
	{
		
	    	City city = new City();
	    	city.setId(id);
	    
	    	return new ResponseEntity<City>(city, HttpStatus.OK);

	  
	}

}
