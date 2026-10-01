package br.com.senai.teste.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.teste.model.Aluno;
import br.com.senai.teste.service.AlunoService;

@RestController
@RequestMapping ("/alunos")
public class AlunoController {
    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }
    @PostMapping 
    public ResponseEntity<Aluno> cadastrarAluno(@RequestBody Aluno aluno) {
        Aluno alunoCadastrado = alunoService.cadastrarAluno(aluno);
        return new ResponseEntity<>(alunoCadastrado, HttpStatus.CREATED);
    }
}
