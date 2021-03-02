package br.com.ralmeida.financas.testes;

import br.com.ralmeida.financas.domain.Carteira;
import br.com.ralmeida.financas.domain.Despesas;
import br.com.ralmeida.financas.services.CalculoImpl;

public class Main {
	
	public static void main(String[] args) {

		double resultado;

		CalculoImpl calculo = new CalculoImpl();

		Carteira carteira = new Carteira();
		carteira.setValor(300);

		Despesas despesa = new Despesas("Conta de Luz", 230.84, 03, 02);

		resultado = calculo.subtrairValorCarteira(despesa, carteira);

		System.out.println("Voc� pagou a conta e tem " + resultado + " na carteira");
	}
}