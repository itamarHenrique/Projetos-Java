package br.com.acampamento.exemplo1Acampamento.entidade;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Aluno {

    private int matricula;
    private String nome;
    private String sobrenome;
    private String cpf;
    
    
    


}
