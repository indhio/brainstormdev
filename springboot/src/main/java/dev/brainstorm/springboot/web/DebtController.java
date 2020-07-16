package dev.brainstorm.springboot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.brainstorm.springboot.entity.Debt;
import dev.brainstorm.springboot.services.DebtService;

@RestController
@RequestMapping("/debt")
public class DebtController {

	@Autowired
	DebtService debtService;

	@GetMapping("/list")
	public ResponseEntity<Object> list() {
		return new ResponseEntity<Object>(debtService.listAll(), new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Object> getById(@PathVariable("id") Long id) {
		return new ResponseEntity<Object>(debtService.getDebtById(id), new HttpHeaders(), HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<Object> create(@RequestBody Debt debt) {
		return new ResponseEntity<Object>(debtService.create(debt), new HttpHeaders(), HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<Object> update(@RequestBody Debt debt) {
		return new ResponseEntity<Object>(debtService.update(debt), new HttpHeaders(), HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Object> delete(@PathVariable("id") Long id) {
		return new ResponseEntity<Object>(debtService.delete(id), new HttpHeaders(), HttpStatus.OK);
	}

}