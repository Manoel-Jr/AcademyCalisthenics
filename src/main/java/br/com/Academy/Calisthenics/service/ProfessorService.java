package br.com.Academy.Calisthenics.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.Academy.Calisthenics.entity.Professor;
import br.com.Academy.Calisthenics.repository.ProfessorRepository;

public class ProfessorService {

	@Autowired
	private ProfessorRepository professorRepository;
	
	
	public Professor salvarProfessor(Professor prof) {
		return professorRepository.save(prof);
	}
	
	
	public Professor buscarProfessor(Long id) {
		Optional<Professor> prof = professorRepository.findById(id);
		return prof.get();
	}
	
	
	public void excluirProfessor(Long id) {
		professorRepository.deleteById(id);
	}
	
	
	public Professor atualizarDadosProfessor(Professor professor , Long id) {
		professor.setId(id);
		Professor prof = professorRepository.save(professor);
		return prof;
	}
}
