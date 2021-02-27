package br.com.Academy.Calisthenics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.Academy.Calisthenics.entity.Professor;

@Service
public interface ProfessorRepository extends JpaRepository<Professor, Long>{

}
