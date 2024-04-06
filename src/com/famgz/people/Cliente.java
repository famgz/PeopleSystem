package com.famgz.people;

import java.time.LocalDate;

public class Cliente extends Pessoa {

	private Profissao profissao;

	public Cliente(String nome, LocalDate dataNascimento, Endereco endereco, Telefone telefone, Profissao profissao) {
		super(nome, dataNascimento, endereco, telefone);
		this.profissao = profissao;
	}


}
