package br.com.restaurante.funcionarios.main;

import java.util.Date;

import br.com.restaurante.funcionarios.IFuncionario;
import br.com.restaurante.funcionarios.model.Cozinheiro;
import br.com.restaurante.funcionarios.model.Garcom;
import br.com.restaurante.funcionarios.model.Gerente;

public class Main {

	public static void main(String[] args) {
		IFuncionario cozinheiro = new Cozinheiro("John Doe", "5511999999999", "john-doe@email.com", "99999999999", "Sous-chef", 6000.00, "manhã", new Date(), 0.15);
		IFuncionario garcom = new Garcom("Jane Smith", "5511988888888", "jane-smith@email.com", "88888888888", "Atendente", 3000.00, "tarde", new Date(), 0.10, 5);
		IFuncionario gerente = new Gerente("Alice Johnson", "5511977777777", "alice-johnson@email.com", "77777777777", "Gerente Geral", 10000.00, "integral", new Date(), 0.20, "Administração");

		System.out.println("\n-------------------------------------------------");
		cozinheiro.calcularComissao();
		cozinheiro.calcularSalario();
		cozinheiro.calcularRescisao();

		System.out.println("\n-------------------------------------------------");
		garcom.calcularComissao();
		garcom.calcularSalario();
		garcom.calcularRescisao();

		System.out.println("\n-------------------------------------------------");
		gerente.calcularComissao();
		gerente.calcularSalario();
		gerente.calcularRescisao();

		System.out.println("-------------------------------------------------");
	}

}
