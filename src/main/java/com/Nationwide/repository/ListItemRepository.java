package com.Nationwide.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Nationwide.domain.ListItem;

public interface ListItemRepository extends JpaRepository<ListItem, Integer>{

}
