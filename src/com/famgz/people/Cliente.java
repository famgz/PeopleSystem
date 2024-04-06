package com.famgz.people;

import java.time.LocalDate;

import com.famgz.composicoes.Endereco;
import com.famgz.composicoes.Profissao;
import com.famgz.composicoes.Telefone;

public class Cliente extends Pessoa {

	private String codigo;
	private Profissao profissao;

			
	public Cliente(String nome, LocalDate dataNascimento, Endereco endereco, Telefone telefone, String codigo, Profissao profissao) {
		super(nome, dataNascimento, endereco, telefone);
		this.profissao = profissao;
	}

}
