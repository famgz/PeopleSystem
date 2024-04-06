package com.famgz;

import java.time.LocalDate;

import com.famgz.composicoes.*;
import com.famgz.people.*;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente(
				"Pedro",
				LocalDate.of(2001, 01, 01),
				new Endereco(),
				new Telefone(),
				"001",
				Profissao.ADVOGADO);

		Funcionario funcionario = new Funcionario(
				"Carlos",
				LocalDate.of(1990, 2, 3),
				new Endereco(),
				new Telefone(),
				Cargo.CONSULTOR,
				3000,
				LocalDate.of(2022, 3, 3));

		System.out.println(cliente.getNome());
		System.out.println(cliente.obterIdade());
		System.out.println("gooz");
	}
}
