package br.com.acampamento.exemplo1Acampamento.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.acampamento.exemplo1Acampamento.entidade.Aluno;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {

    @GetMapping
    public String getAll(){
        Aluno aluno = new Aluno(1485, "Pericles", "Jeribum", "025.992.320-32");

        return aluno.toString();
    }

}


