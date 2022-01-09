package com.th.services;

import com.th.dto.UserSignUp;
import com.th.exception.InfyBankException;

public interface UserService {
	
	public Integer addUser(UserSignUp userSignUp);
}
