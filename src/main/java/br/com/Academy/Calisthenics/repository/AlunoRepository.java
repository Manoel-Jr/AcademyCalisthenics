package br.com.Academy.Calisthenics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.Academy.Calisthenics.entity.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>{

	public boolean existsBydCpf(String cpf);
}
