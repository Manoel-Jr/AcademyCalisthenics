package br.com.Academy.Calisthenics.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "horarios")
@Data
public class Horario {

	private Long id;
	private LocalDateTime dataHora;
}
