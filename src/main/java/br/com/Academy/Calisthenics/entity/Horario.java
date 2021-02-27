package br.com.Academy.Calisthenics.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "horarios")
@Data
public class Horario {

	private Long id;
	private LocalDate data;
	private String hora;
}
