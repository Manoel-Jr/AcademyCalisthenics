package br.com.Academy.Calisthenics.Enum;

public enum Situacao {

	ATIVO(1),
	NÃO_ATIVO(2);
	
	private int situacao;
	
	Situacao(int situacao) {
		this.situacao = situacao;
	}
}
