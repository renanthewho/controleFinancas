package br.com.ralmeida.financas.domain;

public class DespesasVariaveis extends Despesas{
	
	private int diaVencimento;
	private int mesVencimento;
	
	public DespesasVariaveis(){
	}
	
	public DespesasVariaveis(String descricao, double valor, int diaVencimento,int mesVencimento){
		super(descricao,valor);
		this.diaVencimento = diaVencimento;
		this.mesVencimento = mesVencimento;
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
