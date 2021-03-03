package br.com.ralmeida.financas.services;

import java.util.List;

import br.com.ralmeida.financas.domain.Carteira;
import br.com.ralmeida.financas.domain.Despesas;
import br.com.ralmeida.financas.interfaces.Calculo;

public class CalculoImpl implements Calculo{
	
	private final String SALDO_INSUFICIENTE = "O seu saldo na carteira é insuficiente.";
	private double resultado;

	@Override
	public Object subtrairValorCarteira(List<Despesas> despesas, Carteira carteira) {

		for(Despesas despesa : despesas){
			if (despesa.getValor() > 0) {
				resultado = carteira.getValor() - despesa.getValor();
				 if(resultado<0) {
				 return SALDO_INSUFICIENTE;
				 }
			}
		}

		return resultado;
	}

	@Override
	public double somarValorCarteira(Carteira carteira, int valor) {

		return carteira.getValor() + valor;
	}

}
