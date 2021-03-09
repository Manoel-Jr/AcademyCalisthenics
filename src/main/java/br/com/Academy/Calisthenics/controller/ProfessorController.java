package br.com.Academy.Calisthenics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.Academy.Calisthenics.entity.Professor;
import br.com.Academy.Calisthenics.service.ProfessorService;

@RestController
@RequestMapping("/professor")
public class ProfessorController {

	
	@Autowired
	private ProfessorService professorService;
	
	
	@PostMapping
	public ResponseEntity<Professor> salvar(Professor professor) throws Exception{
		return new ResponseEntity<>(professorService.salvarProfessor(professor), HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Professor> buscarProfessorPorId(Long id) throws Exception{
		return new ResponseEntity<>(professorService.buscarProfessor(id), HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus
	public void deletaProfessor(Long id) throws Exception {
		professorService.excluirProfessor(id);
	}
	
	@PutMapping
	@ResponseStatus(code = HttpStatus.OK)
	public void atualizar(Professor professor, Long id) throws Exception{
		professorService.atualizarDadosProfessor(professor, id);
	}
}
