package com.famgz.people;

import java.time.LocalDate;
import java.time.Period;

import com.famgz.composicoes.Endereco;
import com.famgz.composicoes.Telefone;

abstract class Pessoa {
	private String nome;
	private LocalDate dataNascimento;
	private Endereco endereco;
	private Telefone telefone;

	public Pessoa(String nome, LocalDate dataNascimento, Endereco endereco, Telefone telefone) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public int obterIdade() {
		LocalDate currentDate = LocalDate.now();
		return Period.between(this.dataNascimento, currentDate).getYears();
	}

	boolean cadastrar() {
		return true;
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public Telefone getTelefone() {
		return telefone;
	}

}
