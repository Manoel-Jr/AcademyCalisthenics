package br.com.Academy.Calisthenics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.Academy.Calisthenics.entity.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long>{

	public boolean existsByTelefone(String telefone);
}
