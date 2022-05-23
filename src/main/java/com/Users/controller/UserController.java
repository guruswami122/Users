package com.Users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Users.dto.UserOrdersResponse;
import com.Users.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userservice;
	
	@GetMapping("/{userId}/orders")
	public UserOrdersResponse getUserAndOrdersByUserIdPathvar(@PathVariable String userId) {
		return userservice.getOrdersByUserId(userId);
	}
	
	@PostMapping("/orders")
	public UserOrdersResponse getUserAndOrdersByUserIdPost(@RequestParam String userId) {
		return userservice.getAllByPostReqParam(userId);
	}

}
