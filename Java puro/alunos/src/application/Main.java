package application;

import java.util.Scanner;
import program.Aluno;
import program.AlunoManager;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        AlunoManager alunoManager = new AlunoManager();
        int sentinela;

        do {
            System.out.println("Seja bem-vindo ao CRUD de aluno. Qual operação você deseja fazer?");
            System.out.println("1 - Adicionar novo aluno.");
            System.out.println("2 - Editar aluno já existente pelo nome.");
            System.out.println("3 - Mostrar todos alunos já existentes.");
            System.out.println("4 - Remover aluno pelo nome.");
            System.out.println("0 - Para sair do programa.");
            System.out.print("Escolha: ");
            
            sentinela = teclado.nextInt();
            teclado.nextLine();

            switch (sentinela) {
                case 1:
                    adicionarAluno(teclado, alunoManager);
                    break;
                case 2:
                    editarAluno(teclado, alunoManager);
                    break;
                case 3:
                    alunoManager.mostrarAlunos();
                    break;
                case 4:
                    removerAluno(teclado, alunoManager);
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (sentinela != 0);

        teclado.close();
    }

    private static void adicionarAluno(Scanner teclado, AlunoManager alunoManager) {
        System.out.print("Digite o primeiro nome do aluno: ");
        String primeiroNome = teclado.nextLine();
        System.out.print("Digite o sobrenome do aluno: ");
        String sobrenome = teclado.nextLine();
        System.out.print("Digite o registro de aluno do aluno: ");
        String registroDeAluno = teclado.nextLine();
        System.out.print("Digite a unidade de ensino do aluno: ");
        String unidadeDeEnsino = teclado.nextLine();

        Aluno aluno = new Aluno(primeiroNome, sobrenome, registroDeAluno, unidadeDeEnsino);
        alunoManager.adicionaAluno(aluno);
    }

    private static void editarAluno(Scanner teclado, AlunoManager alunoManager) {
        System.out.print("Digite o nome do aluno que deseja editar: ");
        String nome = teclado.nextLine();

        System.out.print("Novo primeiro nome: ");
        String novoPrimeiroNome = teclado.nextLine();
        System.out.print("Novo sobrenome: ");
        String novoSobrenome = teclado.nextLine();
        System.out.print("Novo registro de aluno: ");
        String novoRA = teclado.nextLine();
        System.out.print("Nova unidade de ensino: ");
        String novaUnidade = teclado.nextLine();

        alunoManager.editarAluno(nome, novoPrimeiroNome, novoSobrenome, novoRA, novaUnidade);
    }

    private static void removerAluno(Scanner teclado, AlunoManager alunoManager) {
        System.out.print("Digite o nome do aluno que deseja remover: ");
        String nome = teclado.nextLine();
        alunoManager.removerAluno(nome);
    }
}
