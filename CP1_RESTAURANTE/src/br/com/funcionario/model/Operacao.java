package br.com.funcionario.model;

public class Operacao extends InformacaoFuncionario{
	
	
	
	
	//GARÇOM
	public Operacao (String nome) {
		super(nome);
	}
	
	public void anotarPedido() {
		System.out.println();
	}
	
	public void entregarPedido() {
		System.out.println();
	}
	
	
	
	
	//COZINHEIRO
	
	public void prepararPedido() {
		System.out.println();
	}
	
	public void notificarPedidoPronto() {
		System.out.println();
	}
	
	
	
	//GERENTE
	
	public void contratarFuncionario() {
		System.out.println();
	}
	
	public void emitirRelatorioVendar() {
		System.out.println();
	}
	
	public void organizarescala() {
		System.out.println();
	}
	
}
