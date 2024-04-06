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

	public Pessoa() {
		System.out.println("Criando uma pessoa sem atributos");
	}

	public Pessoa(String nome, LocalDate dataNascimento, Endereco endereco, Telefone telefone) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.telefone = telefone;
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

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
}
