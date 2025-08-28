package com.jne.interanet.dao;

import org.springframework.stereotype.Repository;

import com.jne.interanet.models.Users;


@Repository
public interface UsersDao  {
	
	boolean saveUserDetails(Users payload);


}
