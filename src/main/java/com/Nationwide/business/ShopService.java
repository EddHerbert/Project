//package com.Nationwide.business;
//
//
//import java.awt.List;
//import java.util.ArrayList;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.Nationwide.domain.Shop;
//import com.Nationwide.repository.ShopRepository;
//
//@Service
//public class ShopService {
//	
//	@Autowired
//	
//	private ShopRepository repo;
//	
//	public ShopService () {
//		
//
//	}
//	
//	public List <Shop> getAllDlist() {
//
//		
//
//		if (repo.findAll().isEmpty()) {
//
//			setUpDlist();
//
//		}
//
//		return repo.findAll();
//
//	}
//
//
//
//	public Shop addNewDlist(Shop dlist) {
//
//		return repo.save(dlist);
//
//	}
//
//
//
//	public Shop updateList(Shop dlist) {
//
//		return repo.save(dlist);
//
//	}
//
//
//
//	public String deleteDlist(String id) {
//
//		repo.deleteById(id);
//
//		return "List removed"; }
//
//		private void createNewList() {
//
//		}	
//		
//		
//		}
