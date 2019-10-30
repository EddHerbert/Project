package com.Nationwide.rest;

import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Nationwide.business.ShopService;

@RestController
@RequestMapping ("/shop")
public class ShopController {
	
	@Autowired
	
	private ShopService shopService;
	
	
	@GetMapping (value ="list")
	public List <List> getAllList (){
	return shopService.getAllList();
	}
	
	
	
	

}

