package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    private static List<String> alunos = new ArrayList<>();

    public static void main(String Args[]){

        adicionaAluno("Emanuel");

        imprimirLista();

        removeAluno("Emanuel");

        imprimirLista();
        


    }

    public static void adicionaAluno(String nome){
        alunos.add(nome);
    }

    public static void imprimirLista(){
        for (String aluno : alunos) {
            System.out.println("O nome do aluno é: " + aluno);
        }
        
        if(alunos.isEmpty()){
            System.out.println("A lista está vazia");
        }
    }

    public static void removeAluno(String nome){
        Iterator<String> iterator = alunos.iterator();
        while(iterator.hasNext()){
            String aluno = iterator.next();
            if(aluno.equals(nome)){
                iterator.remove();
            }
        }
    }

}
