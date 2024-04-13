package com.famgz.people;

import java.time.LocalDate;

import com.famgz.composicoes.Endereco;
import com.famgz.composicoes.Profissao;
import com.famgz.estrutura.ListaDeTelefones;

public class Cliente extends Pessoa {

	private String codigo;
	private Profissao profissao;

	public Cliente(String nome, LocalDate dataNascimento, Endereco endereco, ListaDeTelefones telsContato,
			String codigo, Profissao profissao) {
		super(nome, dataNascimento, endereco, telsContato);
		this.codigo = codigo;
		this.profissao = profissao;
	}

	public String getCodigo() {
		return codigo;
	}

	public Profissao getProfissao() {
		return profissao;
	}

}
