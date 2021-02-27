package br.com.Academy.Calisthenics.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.Academy.Calisthenics.Enum.TipoTreino;
import br.com.Academy.Calisthenics.Enum.Turno;
import lombok.Data;

@Data
@Entity
@Table(name = "alunos")
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String nome;
	
	@Column
	private String cpf;
	
	@Column
	private Professor professor;
	
	@Column
	private Horario horario;
	
	@Column
	private String endereco;
	
	@Column
	private String telefone;
	
	@Column
	private String whatssap;
	
	
	@Column
	private Turno turno;
	
	@Column
	private TipoTreino tipoTreino;
}
