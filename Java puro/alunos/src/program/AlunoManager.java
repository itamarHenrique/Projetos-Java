package program;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AlunoManager {

    private static List<AlunoManager> alunos = new ArrayList<>();

    private String primeiroNome;
    private String sobrenome;
    private String registroAluno;
    private String unidadeDeEnsino;

    public AlunoManager(){

    }
    
    public String getPrimeiroNome() {
        return primeiroNome;
    }
    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getRA() {
        return registroAluno;
    }
    public void setRA(String registro) {
        registroAluno = registro;
    }
    public String getUnidadeDeEnsino() {
        return unidadeDeEnsino;
    }
    public void setUnidadeDeEnsino(String unidadeDeEnsino) {
        this.unidadeDeEnsino = unidadeDeEnsino;
    }


    
    public static void adicionaAluno(AlunoManager aluno){
        alunos.add(aluno);
    }

    public static void imprimirLista(){
        
        if(alunos.isEmpty()){
            System.out.println("A lista está vazia");
        }else{
            for (AlunoManager aluno : alunos) {
                System.out.println("O nome do aluno é: " + aluno);
            }
        }

    public static void removeAluno(AlunoManager nome){
        Iterator<AlunoManager> iterator = alunos.iterator();
        boolean alunoRemovido = false;
        while(iterator.hasNext()){
            AlunoManager aluno = iterator.next();
            if(aluno.equals(nome)){
                iterator.remove();
                alunoRemovido = true;
                System.out.println("Aluno removido!");
                break;
            }
        }

        if(!alunoRemovido){
            System.out.println("Aluno não encontrado");
        }
    }

    public static void editarAluno(String primeiroNome, AlunoManager novosDados){
        boolean encontrado = false;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o nome: ");
        String novoNome = teclado.nextLine();
        System.out.println("Insira o sobrenome: ");
        String sobrenome = teclado.nextLine();
        System.out.println("Digite o registro de aluno: ");
        String registroAluno = teclado.nextLine();
        System.out.println("Digite a unidade de ensino do aluno: ");
        String unidade = teclado.nextLine();
        
        for (AlunoManager aluno : alunos) {
            if(aluno.getPrimeiroNome() == primeiroNome){
                // aluno.setPrimeiroNome(novosDados.getPrimeiroNome());
                // aluno.setSobrenome(novosDados.getSobrenome());
                // aluno.setRA(novosDados.getRA());
                // aluno.setUnidadeDeEnsino(novosDados.getUnidadeDeEnsino());
                aluno.setPrimeiroNome(novoNome);
                aluno.setSobrenome(sobrenome);
                aluno.setRA(registroAluno);
                aluno.setUnidadeDeEnsino(unidade);
                encontrado = true;
                break;
            }
        }

        if(!encontrado){
            System.out.println("Aluno não encontrado");
        }
    }

    

}
