package br.com.ralmeida.financas.interfaces;


import br.com.ralmeida.financas.domain.Carteira;
import br.com.ralmeida.financas.domain.Despesas;

public interface Calculo {

	public double subtrairValorCarteira(Despesas despesas, Carteira carteira);

	public double somarValorCarteira(Carteira carteira, int valor);

}