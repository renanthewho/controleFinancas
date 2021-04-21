package br.com.ralmeida.financas.testes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.ralmeida.financas.domain.Carteira;
import br.com.ralmeida.financas.domain.Despesas;
import br.com.ralmeida.financas.domain.DespesasFixas;
import br.com.ralmeida.financas.domain.DespesasVariaveis;
import br.com.ralmeida.financas.services.CalculoImpl;

public class Main {
	
	public static void main(String[] args) {

		Object resultado;
		final String SALDO_INSUFICIENTE = "O seu saldo na carteira � insuficiente.";
		Scanner scan = new Scanner(System.in);

		CalculoImpl calculo = new CalculoImpl();

		Carteira carteira = new Carteira();
		carteira.setValor(1000);

		//Despesas despesa = new DespesasVariaveis("Conta de Luz", 300, 03, 02);
		
		List<Despesas>despesas = new ArrayList<>();
		
		System.out.println("Entre um valor para a lista de Despesas.");
		
		despesas.add(new DespesasVariaveis(scan.nextLine(), scan.nextDouble(), scan.nextInt(), scan.nextInt()));
//		despesas.add(new DespesasVariaveis("Agua", 99, 03, 02));
//		despesas.add(new DespesasFixas("Telefone", 100, 03, 02));

		resultado = calculo.subtrairValorCarteira(despesas, carteira);
		
		if(!resultado.equals(SALDO_INSUFICIENTE)){
			System.out.println("Voc� pagou as contas, e tem " + resultado + " na carteira.");
		}else{
			System.out.println(SALDO_INSUFICIENTE);
		}
		
		scan.close();
	}
}
