package com.robertocosta.crudcliente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.robertocosta.crudcliente.dto.ClientDTO;
import com.robertocosta.crudcliente.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	public List<ClientDTO> findAll(){
		return repository.findAll().stream().map(x -> new ClientDTO(x)).toList();
	}

}
