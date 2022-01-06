package com.th.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.th.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
