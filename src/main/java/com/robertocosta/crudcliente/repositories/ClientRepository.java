package com.robertocosta.crudcliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robertocosta.crudcliente.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
