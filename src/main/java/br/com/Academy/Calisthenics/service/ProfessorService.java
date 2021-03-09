package br.com.Academy.Calisthenics.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.Academy.Calisthenics.entity.Professor;
import br.com.Academy.Calisthenics.exception.AplicationException;
import br.com.Academy.Calisthenics.repository.ProfessorRepository;

@Service
public class ProfessorService {

	@Autowired
	private ProfessorRepository professorRepository;
	
	
	public Professor salvarProfessor(Professor prof) throws Exception {
		verificaProfessor(prof.getTelefone());
		return professorRepository.save(prof);
	}
	
	public void verificaProfessor(String telefone) {
		if(professorRepository.existsByTelefone(telefone)) {
			throw new AplicationException("Professor ja existe!");
		}
	}
	
	public Professor buscarProfessor(Long id) throws Exception {
		Professor professor = professorRepository.getOne(id);
		if(professor != null) {
			return professor;
		}
		throw new Exception("Professor não existe!");
	}
	
	
	public void excluirProfessor(Long id) throws Exception {
		Professor professor = buscarProfessor(id);
		if(professor != null) {
			
		}
		throw new Exception("Professor INvalido!");
	}
	
	
	public void atualizarDadosProfessor(Professor professor , Long id) throws Exception {
		professor = buscarProfessor(id);
		if(professor != null) {
			Professor prof = professorRepository.save(professor);
		}
		throw new Exception("Professor Invalido!");
	}
}
