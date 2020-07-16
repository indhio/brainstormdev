package dev.brainstorm.springboot.web;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AppController {

	@GetMapping
	public ResponseEntity<Object> root() {
		return new ResponseEntity<Object>("Nosso Teste Brainstorm DEV", new HttpHeaders(), HttpStatus.OK);
	}

}