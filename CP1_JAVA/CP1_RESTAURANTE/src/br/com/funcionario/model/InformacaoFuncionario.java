package br.com.funcionario.model;

import java.time.LocalDate;

public class InformacaoFuncionario {
	protected String nome;
	int cpf;
	int idade;
	String cargo;
	double salario;
	String turno;
	LocalDate data_admissao;
	
	public InformacaoFuncionario(String nome, int cpf, int idade, String cargo, double salario, String turno,
			LocalDate data_admissao) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.cargo = cargo;
		this.salario = salario;
		this.turno = turno;
		this.data_admissao = data_admissao;
	}

	public InformacaoFuncionario(String nome) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCpf() {
		return cpf;
	}
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getTurno() {
		return turno;
	}
	
	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	public LocalDate getData_admissao() {
		return data_admissao;
	}
	
	public void setData_admissao(LocalDate data_admissao) {
		this.data_admissao = data_admissao;
	}
	
	public void exibirDados() {
		System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$" + salario);
        System.out.println("Turno: " + turno);
        System.out.println("Data de Admissão: " + data_admissao);
	}
	
}
