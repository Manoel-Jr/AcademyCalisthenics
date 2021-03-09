package br.com.Academy.Calisthenics.entity;

import java.time.LocalDate;

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
	private String endereco;
	private Integer numeroCasa;
	private Turno turno;
	private LocalDate dataInicio;
}
