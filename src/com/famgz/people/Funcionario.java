package com.famgz.people;

import java.time.LocalDate;

import com.famgz.composicoes.Cargo;
import com.famgz.composicoes.Endereco;
import com.famgz.composicoes.Telefone;

public class Funcionario extends Pessoa {
	private Cargo cargo;
	private double salario;
	private LocalDate dataAdmissao;

	public Funcionario(
			String nome,
			LocalDate dataNascimento,
			Endereco endereco,
			Telefone telefone,
			Cargo cargo,
			double salario,
			LocalDate dataAdmissao) {
		super(nome, dataNascimento, endereco, telefone);
		this.cargo = cargo;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
	}

	public boolean reajustarSalario(double novoSalario) {
		if (novoSalario <= 0) {
			return false;
		}
		this.salario = novoSalario;
		return true;
	}

	public boolean promover(Cargo novoCargo) {
		this.cargo = novoCargo;
		return true;
	}

}
