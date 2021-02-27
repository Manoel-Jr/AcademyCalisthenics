package br.com.Academy.Calisthenics.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.Academy.Calisthenics.Enum.Turno;
import lombok.Data;

@Entity
@Table(name = "Professores")
@Data
public class Professor {

	private Long id;
	private String nome;
	private String cpf;
	private String telefone;
	private String whatssap;
	private Horario horario;
	private Turno turno;
}
