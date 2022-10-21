package com.example.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.User;
@Service
public class UserServiceImpl implements UserService {

	List<User> list=List.of(
			new User(1311L,"Akshay Bhosale","52426272"),
	        new User(1391L,"Amol Bhosale","5244555272"),
            new User(1318L,"Ajay Bhosale","98282822"));

	
							
	
	@Override
	public User getUserId(Long id) {
		
		return list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
	}

}
