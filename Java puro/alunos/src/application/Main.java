package application;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String Args[]){
        // System.out.println("Olá mundo");

        List<String> alunos = new ArrayList<>();

        alunos.add("Pablo");
        alunos.add("Jackson");
        alunos.add("Henrique");
        alunos.add("Larissa");

        for (String aluno : alunos) {
            System.out.println("O nome do aluno é: " + aluno);

        }
    }

}
