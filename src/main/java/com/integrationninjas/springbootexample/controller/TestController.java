package com.integrationninjas.springbootexample.controller;

import java.util.HashMap;
import java.util.Map;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Test Controller", description = "Endpoints de prueba")
public class TestController {

	@Operation(summary = "Endpoint de prueba", description = "Devuelve un objeto con información de prueba")
	@ApiResponse(responseCode = "200", description = "OK")
	@GetMapping
	public Object hello() {
		Map<String, String> object = new HashMap<>();
		object.put("name", "Jeanpierre Robles Claudio");
		object.put("Description", "First integration Java Spring Boot Application for JP");
		object.put("email", "jeanpierre.robles@gmail.com");
		return object;
	}

}
