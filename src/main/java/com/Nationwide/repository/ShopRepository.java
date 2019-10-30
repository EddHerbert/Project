package com.Nationwide.repository;


import java.awt.List;
import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.Nationwide.domain.easyShop;

@Repository
public interface ShopRepository extends JpaRepository <easyShop, String> {



public ArrayList <easyShop> findAll();

public easyShop addNewDlist(easyShop dlist);

}

