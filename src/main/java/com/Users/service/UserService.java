package com.Users.service;

import com.Users.dto.UserOrdersResponse;

public interface UserService {
	
	UserOrdersResponse getOrdersByUserId(String userId);
	UserOrdersResponse getAllByPostReqParam(String userId);

}
