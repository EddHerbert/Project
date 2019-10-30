package com.Nationwide.business;

import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Nationwide.repository.ShopRepository;

@Service
public class ShopService {
	
	@Autowired
	
	private ShopRepository repository;
	
	public ShopService ()	{
		
		
	}
	
	public List <Shop> getAllList() {
		if (Shoprepo.findAll().isEmpty()) {
		
		}
		return ShopRepo.findAll();
	}

	public Trainer addNewTrainer(Trainer trainer) {
		return trainerRepo.save(trainer);
	}

	public Trainer updateTrainer(Trainer trainer) {
		return trainerRepo.save(trainer);
	}

	public String deleteTrainer(Long id) {
		trainerRepo.deleteById(id);
		return "Trainer succesfully deleted";
}
