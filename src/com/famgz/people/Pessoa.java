package com.famgz.people;

import java.time.LocalDate;
import java.time.Period;

abstract class Pessoa {
	String nome;
	LocalDate dataNascimento;
	String endereco;
	String telefone;

	public Pessoa(String nome, LocalDate dataNascimento, String endereco,
			String telefone) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public int obterIdade() {
		LocalDate currentDate = LocalDate.now();
		Period age = Period.between(this.dataNascimento, currentDate);
		int years = age.getYears();
		return years;
	}

	boolean cadastrar() {

		return true;
	}
}
