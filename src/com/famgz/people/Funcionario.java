package com.famgz.people;

import java.time.LocalDate;

public class Funcionario extends Pessoa {
	private String cargo;
	private double salario;
	private LocalDate dataAdmissao;

	public Funcionario(String nome, LocalDate dataNascimento, String endereco,
			String telefone, String cargo, double salario,
			LocalDate dataAdmissao) {
		super(nome, dataNascimento, endereco, telefone);
		this.cargo = cargo;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
	}

}