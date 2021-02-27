package br.com.Academy.Calisthenics.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.Academy.Calisthenics.entity.Aluno;
import br.com.Academy.Calisthenics.repository.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository alunoRepository;
	
	
	public Aluno salvarAluno(Aluno aluno) {
		return alunoRepository.save(aluno);
	}
	
	public Aluno buscarAluno(Long id) {
		Optional<Aluno> aluno = alunoRepository.findById(id);
		return aluno.get();
	}
	
	public void excluirAluno(Long id) {
		alunoRepository.deleteById(id);
	}
	
	public Aluno atualizarDadosAluno(Aluno aluno, Long id) {
		aluno.setId(id);
		Aluno novoAluno = salvarAluno(aluno);
		return novoAluno;
	}
}
