package com.robertocosta.crudcliente.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.robertocosta.crudcliente.dto.ClientDTO;
import com.robertocosta.crudcliente.service.ClientService;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {
	
	@Autowired
	private ClientService service;
	
	@GetMapping
	public Page<ClientDTO> findAll(Pageable pageable) {
		return service.findAll(pageable);
	}
}
