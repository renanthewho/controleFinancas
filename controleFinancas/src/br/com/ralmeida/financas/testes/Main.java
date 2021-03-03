package br.com.ralmeida.financas.testes;

import java.util.ArrayList;
import java.util.List;

import br.com.ralmeida.financas.domain.Carteira;
import br.com.ralmeida.financas.domain.Despesas;
import br.com.ralmeida.financas.domain.DespesasFixas;
import br.com.ralmeida.financas.domain.DespesasVariaveis;
import br.com.ralmeida.financas.services.CalculoImpl;

public class Main {
	
	public static void main(String[] args) {

		Object resultado;
		final String SALDO_INSUFICIENTE = "O seu saldo na carteira é insuficiente.";

		CalculoImpl calculo = new CalculoImpl();

		Carteira carteira = new Carteira();
		carteira.setValor(1000);

		//Despesas despesa = new DespesasVariaveis("Conta de Luz", 300, 03, 02);
		
		List<Despesas>despesas = new ArrayList<>();
		
		despesas.add(new DespesasVariaveis("Conta de Luz", 300, 03, 02));
		despesas.add(new DespesasVariaveis("Agua", 99, 03, 02));
		despesas.add(new DespesasFixas("Telefone", 59.90, 03, 02));

		resultado = calculo.subtrairValorCarteira(despesas, carteira);
		
		if(!resultado.equals(SALDO_INSUFICIENTE)){
			System.out.println("Você pagou as contas, e tem " + resultado + " na carteira.");
		}else{
			System.out.println(SALDO_INSUFICIENTE);
		}
	}
}
