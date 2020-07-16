package dev.brainstorm.springboot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.brainstorm.springboot.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;

	@GetMapping("/list")
	public ResponseEntity<Object> list() {
		return new ResponseEntity<Object>(userService.listAll(), new HttpHeaders(), HttpStatus.OK);
	}
	
	@GetMapping("/:id")
	public ResponseEntity<Object> getById() {
		return new ResponseEntity<Object>("Nosso Teste Brainstorm DEV", new HttpHeaders(), HttpStatus.OK);
	}

}