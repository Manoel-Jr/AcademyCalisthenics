package br.com.Academy.Calisthenics.dto;

import br.com.Academy.Calisthenics.Enum.TipoTreino;
import br.com.Academy.Calisthenics.Enum.Turno;
import br.com.Academy.Calisthenics.entity.Horario;
import br.com.Academy.Calisthenics.entity.Professor;
import lombok.Data;

@Data
public class AlunoDto {

    private Long id;
	private String nome;
	private String cpf;
	private Professor professor;
	private Horario horario;
	private String endereco;
	private String telefone;
	private String whatssap;
	private Turno turno;
	private TipoTreino tipoTreino;
}
