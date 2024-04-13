package com.famgz.people;

import java.time.LocalDate;
import java.time.Period;

import com.famgz.composicoes.Endereco;
import com.famgz.estrutura.ListaDeTelefones;

abstract class Pessoa {
	private String nome;
	private LocalDate dataNascimento;
	private Endereco endereco;
	private ListaDeTelefones telsContato;

	public Pessoa() {
		System.out.println("Criando uma pessoa sem atributos");
	}

	public Pessoa(String nome, LocalDate dataNascimento, Endereco endereco, ListaDeTelefones telsContato) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.telsContato = telsContato;
	}

	public int obterIdade() {
		return Period
				.between(this.dataNascimento, LocalDate.now())
				.getYears();
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

	public ListaDeTelefones getTelsContato() {
		return telsContato;
	}
}
