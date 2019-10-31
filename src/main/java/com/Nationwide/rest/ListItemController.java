package com.Nationwide.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Nationwide.domain.ListItem;
import com.Nationwide.repository.ListItemRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/items")
public class ListItemController {

	@Autowired
	private ListItemRepository repository;
	
	@GetMapping
	public List<ListItem> getAllItems() {
		return repository.findAll();
	}
	
	@PostMapping
	public ListItem createItem(@RequestBody ListItem item) {
		return repository.saveAndFlush(item);
	}
	
	@PutMapping
	public String updateItem(@RequestBody ListItem item) {
		ListItem databaseItem = repository.getOne(item.getId());
		databaseItem.setName(item.getName());
		repository.flush();
		return "Updated";
	}
	
	@DeleteMapping("/{id}")
	public String deleteItem(@PathVariable Integer id) {
		repository.deleteById(id);
		return "Deleted";
	}
}
