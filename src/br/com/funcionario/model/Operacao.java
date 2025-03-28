package br.com.funcionario.model;

import br.com.funcionario.exception.NotificacaoPedidoInvalido;
import br.com.funcionario.exception.PedidoInvalidoException;

public class Operacao extends InformacaoFuncionario{
	
	
	
	
	//GARÇOM
	public Operacao (String nome) {
		super(nome);
	}
	
	public void anotarPedido() {
		System.out.println(nome + " (Garçom) está anotando o pedido do cliente.");
	}
	
	public void entregarPedido() {
		System.out.println(nome + " (Garçom) está entregando o pedido para o cliente.");
	}
	
	public void anotarPedido(String pedido) throws PedidoInvalidoException {
	    if (pedido == null || pedido.isEmpty()) {
	        throw new PedidoInvalidoException("Pedido inválido: campo vazio.");
	    }
	}
	
	
	
	
	//COZINHEIRO
	
	public void prepararPedido() {
		System.out.println(nome + " (Cozinheiro) está preparando o pedido na cozinha.");
	}
	
	public void notificarPedidoPronto() {
		System.out.println(nome + " (Cozinheiro) notificou que o pedido está pronto.");
	}
	
	public void semNotificacao(String notificacao) throws NotificacaoPedidoInvalido {
		if (notificacao == null || notificacao.trim().isEmpty()) {
	        throw new NotificacaoPedidoInvalido("Notificação inválida: mensagem vazia ou nula.");
	    }

	    System.out.println("Notificação enviada: " + notificacao);
	}
	
	//GERENTE
	
	public void contratarFuncionario() {
		System.out.println(nome + " (Gerente) contratou o funcionário " + ".");
	}
	
	public void emitirRelatorioVendar() {
		System.out.println(nome + " (Gerente) está emitindo o relatório de vendas do dia.");;
	}
	
	public void organizarescala() {
		System.out.println(nome + " (Gerente) está organizando a escala de trabalho da equipe.");
	}
	
	
}
