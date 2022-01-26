package com.example.demo.resource;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.example.demo.model.User;
import com.example.demo.model.UserResponse;

@Controller
public class UserController {

	@MessageMapping("/user")
	@SendTo("/topic/user")
	public UserResponse getUser(User user)
	{
		return new UserResponse("hi"+user.getName());
	}
}
