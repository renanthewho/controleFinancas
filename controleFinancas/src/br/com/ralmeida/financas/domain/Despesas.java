package br.com.ralmeida.financas.domain;

public abstract class Despesas {
	
	private String descricao;
	private double valor;

	public Despesas() {
	}

	public Despesas(String descricao, double valor) {
		super();
		this.descricao = descricao;
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public boolean isPago(Despesas despesa, boolean pago) {
		return pago;
	}
}
