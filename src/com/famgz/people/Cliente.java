package com.famgz.people;

import java.time.LocalDate;

import com.famgz.composicoes.Endereco;
import com.famgz.composicoes.Telefone;

public class Cliente extends Pessoa {

	private Profissao profissao;

	public Cliente(String nome, LocalDate dataNascimento, Endereco endereco, Telefone telefone, Profissao profissao) {
		super(nome, dataNascimento, endereco, telefone);
		this.profissao = profissao;
	}


}
