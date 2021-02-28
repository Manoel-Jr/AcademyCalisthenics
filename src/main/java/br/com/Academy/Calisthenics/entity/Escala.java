package br.com.Academy.Calisthenics.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "escala")
@Data
public class Escala {

	private List<Aluno> listaAlunos;
	private List<Horario> listaHorarios;
	private List<Professor> listaProfessores;
}
