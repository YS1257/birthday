package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@CrossOrigin("http://localhost:5173/")
	@PostMapping(produces = "application/json")
	public ResponseEntity<Long> calculateDaysUntilBirthday(@RequestBody User user){
		long greeting = this.userService.calculateDaysUntilBirthday(user);
		return new ResponseEntity<>(greeting, HttpStatus.OK);
	}

}
