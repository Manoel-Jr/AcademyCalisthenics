package br.com.Academy.Calisthenics.Enum;

public enum Turno {

	MANHA(1),
    TARDE(2),
    NOITE(3);

    private final int valor;

    Turno(int valor) {
        this.valor = valor;
    }

}
