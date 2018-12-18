package com.edson.server.main;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.edson.beans.City;
import com.edson.controllers.HotelByCityRetrieveController;
import com.edson.controllers.HotelRetrieveController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootRest2ApplicationTests {

	@Test
	public void getListOfHotel() {
		
		HotelRetrieveController control = new HotelRetrieveController();
		
		ResponseEntity<City> city = control.getListOfHotel(1);
		
		City objects = city.getBody();
		MediaType contentType = city.getHeaders().getContentType();
		HttpStatus statusCode = city.getStatusCode();
		
        System.out.println(objects);
        System.out.println(contentType);
        System.out.println(statusCode);
		 
	}
	
	@Test
	public void getListOfCity() {
		
		HotelByCityRetrieveController control = new HotelByCityRetrieveController();
		
		ResponseEntity<City> city = control.getListOfCity(1032);
		
		City objects = city.getBody();
		MediaType contentType = city.getHeaders().getContentType();
		HttpStatus statusCode = city.getStatusCode();
		
        System.out.println(objects);
        System.out.println(contentType);
        System.out.println(statusCode);
		 
	}

}
