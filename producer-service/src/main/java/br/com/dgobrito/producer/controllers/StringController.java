package br.com.dgobrito.producer.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.dgobrito.producer.services.StringService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/produces")
public class StringController {
	
	private final StringService service;
	
	@GetMapping
	public ResponseEntity<String> produce(@RequestParam("message") String message) {
		service.produce(message);
		return ResponseEntity.ok().body("Sending message");
	}	
}