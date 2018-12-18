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
public class HotelByCityRetrieveController {
	
	@RequestMapping(value="http://localhost:8080/hotels/avail/{id}")
	public ResponseEntity<City> getListOfCity (@PathVariable("id") int id)
	{
	    
	    	City city = new City();
	    	city.setCityCode(id);
	    
	    	return new ResponseEntity<City>(city, HttpStatus.OK);

	  
	}

}
