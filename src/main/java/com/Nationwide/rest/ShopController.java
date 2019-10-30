package com.Nationwide.rest;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.Nationwide.domain.easyShop;
import com.Nationwide.repository.ShopRepository;

@RestController
public class ShopController {
	
	@Autowired
	
	private ShopRepository repo;
	
	
	@GetMapping ("/dlist")

	public ArrayList <easyShop> findAll() {

		return repo.findAll();

	}
}

//	
//
//	@PostMapping("/dlist")
//
//	public Shop addNewDlist(@RequestBody Shop dlist) {
//
//		return shopservice.addNewDlist(dlist);
//
//	}
//
//	
//
//	@PutMapping ("/dlist")
//
//	public Shop updateList (@RequestBody Shop dlist) {
//
//		return shopservice.updateList(dlist);
//
//	}
//
//	
//
//	@DeleteMapping("/dlist/{id}")
//
//	public String deleteDlist (@PathVariable(value = "id") String id) {
//
//		return shopservice.deleteDlist(id);
//
//	}
//
//
//
//}
//	
//	
//	
//	


