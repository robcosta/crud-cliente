package com.robertocosta.crudcliente.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.robertocosta.crudcliente.dto.ClientDTO;
import com.robertocosta.crudcliente.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public Page<ClientDTO> findAll(Pageable pageable){
		return repository.findAll(pageable).map(x -> new ClientDTO(x));
	}

}
