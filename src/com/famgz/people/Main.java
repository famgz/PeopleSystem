package com.famgz.people;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Ze",
				LocalDate.of(2001, 01, 01), "Rua das amarguras", "32245556",
				"gerente", 10000.0, LocalDate.of(2023, 01, 01));

		System.out.println(funcionario.nome);
		System.out.println(funcionario.obterIdade());

	}

}
