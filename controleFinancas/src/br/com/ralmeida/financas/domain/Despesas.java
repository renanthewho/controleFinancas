package br.com.ralmeida.financas.domain;

public class Despesas {
	
	private String descricao;
	private double valor;
	private int diaVencimento;
	private int mesVencimento;

	public Despesas() {
	}

	public Despesas(String descricao, double valor, int diaVencimento, int mesVencimento) {
		super();
		this.descricao = descricao;
		this.valor = valor;
		this.diaVencimento = diaVencimento;
		this.mesVencimento = mesVencimento;
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

	public int getDiaVencimento() {
		return diaVencimento;
	}

	public void setDiaVencimento(int diaVencimento) {
		this.diaVencimento = diaVencimento;
	}

	public int getMesVencimento() {
		return mesVencimento;
	}

	public void setMesVencimento(int mesVencimento) {
		this.mesVencimento = mesVencimento;
	}


}
