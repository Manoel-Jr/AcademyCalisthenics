package br.com.Academy.Calisthenics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.Academy.Calisthenics.entity.Aluno;

@Service
public interface AlunoRepository extends JpaRepository<Aluno, Long>{

}
