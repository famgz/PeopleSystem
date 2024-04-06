package com.famgz.people;

import java.time.LocalDate;

public class Cliente extends Pessoa {

	private String profissao;

	public Cliente(String nome, LocalDate dataNascimento, String endereco,
			String telefone, String profissao) {
		super(nome, dataNascimento, endereco, telefone);
		this.profissao = profissao;
	}

}
