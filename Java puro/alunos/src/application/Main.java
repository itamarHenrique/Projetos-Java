package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import program.Aluno;
import program.AlunoManager;

public class Main {

    // private static List<Aluno> alunos = new ArrayList<>();

    public static void main(String Args[]){

        Scanner teclado = new Scanner(System.in);
        AlunoManager alunoManager = new AlunoManager();

        int sentinela;

        do {

            System.out.print("Seja bem vindo ao CRUD de aluno. Qual operação você deseja fazer?\n1 - Adicionar novo aluno.\n2 - Editar aluno já existente pelo nome dele.\n3 - Mostrar todos alunos já existentes.\n4 - Remover aluno a partir do nome.\n0 - Para sair do programa");
            
            sentinela = teclado.nextInt();
            teclado.nextLine();

            switch (sentinela) {
                case 1:
                    
                    adicionaAluno(null);                    
                    
            
                default:
                    break;
            }
        }

    }

    public static void adicionaAluno(Scanner teclado, AlunoManager alunoManager){
        String primeiroNome, sobrenome, registroDeAluno, unidadeDeEnsino;
        System.out.print("Digite o primeiro nome do aluno: ");
        primeiroNome = teclado.nextLine();
        System.out.print("Digite o sobrenome do aluno: ");
        sobrenome = teclado.nextLine();
        System.out.print("Digite o registro de aluno do aluno: ");
        registroDeAluno = teclado.nextLine();
        System.out.print("Digite a unidade de ensino do aluno: ");
        unidadeDeEnsino = teclado.nextLine();
        alunos.add(aluno);
    }

    public static void imprimirLista(){
        for (Aluno aluno : alunos) {
            System.out.println("O nome do aluno é: " + aluno);
        }
        
        if(alunos.isEmpty()){
            System.out.println("A lista está vazia");
        }
    }

    public static void removeAluno(Aluno nome){
        Iterator<Aluno> iterator = alunos.iterator();
        while(iterator.hasNext()){
            Aluno aluno = iterator.next();
            if(aluno.equals(nome)){
                iterator.remove();
            }
        }
    }

    public static void editarAluno(String primeiroNome, Aluno novosDados){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o nome: ");
        String novoNome = teclado.nextLine();
        System.out.println("Insira o sobrenome: ");
        String sobrenome = teclado.nextLine();
        System.out.println("Digite o registro de aluno: ");
        String registroAluno = teclado.nextLine();
        System.out.println("Digite a unidade de ensino do aluno: ");
        String unidade = teclado.nextLine();
        
        for (Aluno aluno : alunos) {
            if(aluno.getPrimeiroNome() == primeiroNome){
                aluno.setPrimeiroNome(novosDados.getPrimeiroNome());
                aluno.setSobrenome(novosDados.getSobrenome());
                aluno.setRA(novosDados.getRA());
                aluno.setUnidadeDeEnsino(novosDados.getUnidadeDeEnsino());
                aluno.setPrimeiroNome(novoNome);
                aluno.setSobrenome(sobrenome);
                aluno.setRA(registroAluno);
                aluno.setUnidadeDeEnsino(unidade);
            }
        }
    }

}
