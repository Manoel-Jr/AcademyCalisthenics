package br.com.Academy.Calisthenics.Enum;

public enum TipoTreino {

	HIPERTROFIA(1),
	RESISTENCIA(2),
	POTENCIA(3),
	FORÇA(4);
	
	private int tipo;
	
	TipoTreino(int tipo) {
		this.tipo = tipo;
	}
}
