package br.com.acampamento.exemplo1Acampamento.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.acampamento.exemplo1Acampamento.entidade.Aluno;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {

    private final List<Aluno> listaAlunos = new ArrayList<>();

    @GetMapping
    public List<Aluno> obterTodos(){

        return listaAlunos;

    }

    @PostMapping
    public void inserir(@RequestBody Aluno aluno){

        listaAlunos.add(aluno);
        
    }

    @GetMapping("/{matricula}")
    public Aluno obterAlunoPelaMatricula(@PathVariable int matricula){

        Aluno alunoObtido;

        for (Aluno aluno : listaAlunos) {
            if(aluno.getMatricula() == matricula){
                return alunoObtido = aluno;
            }
        }

        return null;
    }

}


