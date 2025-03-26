package br.com.funcionario.model;

import java.time.*;
import java.util.*;


public class Funcionario extends InformacaoFuncionario {

	public Funcionario(String nome, int cpf, int idade, String cargo, double salario, String turno,
			LocalDate data_admissao) {
		super(nome, cpf, idade, cargo, salario, turno, data_admissao);
		// TODO Auto-generated constructor stub
	}

	public Funcionario(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	
	public void baterPontoentrada() {
		
	}
	
	
	
}
