package com.famgz.people;

import java.time.LocalDate;

import com.famgz.composicoes.Cargo;
import com.famgz.composicoes.Endereco;
import com.famgz.estrutura.ListaDeTelefones;

public class Funcionario extends Pessoa {
	private int matricula;
	private Cargo cargo;
	private double salario;
	private LocalDate dataAdmissao;

	public Funcionario(String nome, LocalDate dataNascimento, Endereco endereco, ListaDeTelefones telsContato,
			int matricula, Cargo cargo, double salario, LocalDate dataAdmissao) {
		super(nome, dataNascimento, endereco, telsContato);
		this.matricula = matricula;
		this.cargo = cargo;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
	}

	public boolean reajustarSalario(double percentual) {
		if (percentual <= 0 || percentual >= 100) {
			return false;
		}
		this.salario *= 1 + (percentual / 100);
		return true;
	}

	public boolean promover(Cargo novoCargo) {
		this.cargo = novoCargo;
		return true;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public double getSalario() {
		return salario;
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public int getMatricula() {
		return matricula;
	}

}
