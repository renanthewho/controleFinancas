package br.com.ralmeida.financas.services;

import br.com.ralmeida.financas.domain.Carteira;
import br.com.ralmeida.financas.domain.Despesas;
import br.com.ralmeida.financas.interfaces.Calculo;

public class CalculoImpl implements Calculo{
	
	private final String SALDO_INSUFICIENTE = "O seu saldo na carteira � insuficiente.";
	private double resultado;

	@Override
	public double subtrairValorCarteira(Despesas despesas, Carteira carteira) {

		if (despesas.getValor() > 0) {
			resultado = carteira.getValor() - despesas.getValor();
			// if(resulted>0) {
			// return
			// }
		}

		return resultado;
	}

	@Override
	public double somarValorCarteira(Carteira carteira, int valor) {

		return carteira.getValor() + valor;
	}

}
