package com.th.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.th.dto.UserSignUp;
import com.th.entity.User;
import com.th.exception.InfyBankException;
import com.th.repositories.UserRepository;

@Service(value = "userService")
@Transactional
public class UserServicesImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public Integer addUser(UserSignUp userSignUp) {
		User u=new User();
		u.setFirstName(userSignUp.getFirstName());
		u.setLastName(userSignUp.getLastName());
		u.setContactNo(userSignUp.getContactNo());
		u.setEmailId(userSignUp.getEmailId());
		u.setPassword(userSignUp.getPassword());
		
		userRepository.save(u);
		return u.getUserId();
	}
	
	
}
