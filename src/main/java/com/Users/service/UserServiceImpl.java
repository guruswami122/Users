package com.Users.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.Users.dto.User;
import com.Users.dto.UserOrdersResponse;

@Service
public class UserServiceImpl implements UserService{
	
	static Map<String, User> userDetails = new HashMap<>();
	static {
		
		User user=new User();
		user.setUserId("100");
		user.setUserName("100Test");
		userDetails.put("100", user);
		
		user=new User();
		user.setUserId("200");
		user.setUserName("200Test");
		userDetails.put("200", user);
	}

	@Override
	public UserOrdersResponse getOrdersByUserId(String userId) {
		// TODO Auto-generated method stub
		User user=userDetails.get(userId);
		UserOrdersResponse userOrdersResponse = new UserOrdersResponse();
		userOrdersResponse.setUser(user);
		return userOrdersResponse;
		
	}

	@Override
	public UserOrdersResponse getAllByPostReqParam(String userId) {
		// TODO Auto-generated method stub
		User user = userDetails.get(userId);
        List<Object> orders = null;
        UserOrdersResponse userOrdersResponse = new UserOrdersResponse();
		userOrdersResponse.setUser(user);
		return userOrdersResponse;
        
	}

}
