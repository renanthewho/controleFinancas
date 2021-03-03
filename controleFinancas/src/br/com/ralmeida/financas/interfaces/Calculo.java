package br.com.ralmeida.financas.interfaces;


import java.util.List;

import br.com.ralmeida.financas.domain.Carteira;
import br.com.ralmeida.financas.domain.Despesas;

public interface Calculo {

	public Object subtrairValorCarteira(List<Despesas> despesas, Carteira carteira);

	public double somarValorCarteira(Carteira carteira, int valor);

}