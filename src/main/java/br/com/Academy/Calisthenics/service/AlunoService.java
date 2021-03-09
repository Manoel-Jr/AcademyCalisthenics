package br.com.Academy.Calisthenics.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.Academy.Calisthenics.entity.Aluno;
import br.com.Academy.Calisthenics.exception.AplicationException;
import br.com.Academy.Calisthenics.repository.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository alunoRepository;
	
	
	public Aluno salvarAluno(Aluno aluno) {
		
		verificarAluno(aluno.getCpf());
		
		return alunoRepository.save(aluno);
	}
	
	public void verificarAluno(String cpf) {
		if(alunoRepository.existsBydCpf(cpf)) {
			throw new AplicationException("Aluno ja Existe!");
		}
	}
	
	public Aluno buscarAluno(Long id) {
		Aluno aluno = alunoRepository.getOne(id);
		if(aluno != null) {
			return aluno;
		}
		return null;
	}
	
	public void excluirAluno(Long id) {
		Aluno aluno = buscarAluno(id);
		if(aluno != null) {
			alunoRepository.deleteById(id);
		}
		throw new AplicationException("Usuario Invalido!");
		
	}
	
	public void atualizarDadosAluno(Aluno aluno, Long id) {
		aluno = buscarAluno(id);
		if(aluno != null) {
			Aluno novoAluno = salvarAluno(aluno);
			
		}
		throw new AplicationException("");
		
	}
}
