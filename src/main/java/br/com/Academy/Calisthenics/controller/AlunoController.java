package br.com.Academy.Calisthenics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.Academy.Calisthenics.entity.Aluno;
import br.com.Academy.Calisthenics.service.AlunoService;

@RestController("/aluno")
public class AlunoController {

	@Autowired
	private AlunoService alunoService;
	
	
	@PostMapping
	public ResponseEntity<Aluno> salvar(Aluno aluno){
		return new ResponseEntity<>(alunoService.salvarAluno(aluno), HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Aluno> buscarAluno(@PathVariable Long id){
		return new ResponseEntity<>(alunoService.buscarAluno(id), HttpStatus.OK);
	}
	
	@ResponseStatus(code = HttpStatus.OK)
	@PutMapping("/{id}")
	public void atualizar(@PathVariable ("id") Long id, Aluno aluno ){
		alunoService.atualizarDadosAluno(aluno, id);
	}
}
