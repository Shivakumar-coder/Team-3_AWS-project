package com.th.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.th.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
