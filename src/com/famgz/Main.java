package com.famgz;

import java.time.LocalDate;

import com.famgz.composicoes.*;
import com.famgz.people.*;

public class Main {

	public static void main(String[] args) {
		Endereco end1 = new Endereco("acacias", "666", "58000068", "Bairro nobre", "Los Angeles", "Paraiba",
				"Brasil");

		// Endereco endereco2 = new Endereco();

		Cliente cliente = new Cliente(
				"Pedro",
				LocalDate.of(2001, 01, 01),
				end1,
				new Telefone(),
				"001",
				Profissao.ADVOGADO);

		Funcionario funcionario = new Funcionario(
				"Carlos",
				LocalDate.of(1990, 2, 3),
				end1,
				new Telefone(),
				12345,
				Cargo.ESTAGIARIO,
				3000,
				LocalDate.of(2022, 3, 3));

		end1.setRua("Nova rua cadastrada");

		System.out.println(cliente.getNome());
		System.out.println(cliente.obterIdade());
		System.out.println(funcionario.getCargo());

		funcionario.promover(Cargo.PLENO);

		System.out.println(funcionario.getCargo());

		funcionario.reajustarSalario(12.4);

		System.out.println(funcionario.getSalario());

		System.out.println(cliente.getEndereco().getRua());
	}
}
