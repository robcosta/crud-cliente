package com.robertocosta.crudcliente.dto;

import java.time.LocalDate;

import org.hibernate.validator.constraints.br.CPF;

import com.robertocosta.crudcliente.entities.Client;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

public class ClientDTO {

	private Long id;
	
	@NotBlank(message = "Campo requerido")
	private String name;
	
	@CPF(message = "CPF inválido")
	private String cpf;
	
	@Positive(message = "Renda deve ser positivo")
	private Double income;
	
	@PastOrPresent(message = "Data inválida")
	private LocalDate birthDate;
	
	@PositiveOrZero(message = "Número de filhos não pode ser negativo")
	private Integer children;

	public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.income = income;
		this.birthDate = birthDate;
		this.children = children;
	}
	
	public ClientDTO(Client entity) {
		id = entity.getId();
		name = entity.getName();
		cpf = entity.getCpf();
		income = entity.getIncome();
		birthDate = entity.getBirthDate();
		children = entity.getChildren();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCpf() {
		return cpf;
	}

	public Double getIncome() {
		return income;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public Integer getChildren() {
		return children;
	}
}
