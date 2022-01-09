package com.th.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.th.entity.JewelleryDB;

public interface JewelleryRepository extends JpaRepository<JewelleryDB, Integer>{
	
}
