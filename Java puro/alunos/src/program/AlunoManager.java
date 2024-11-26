package program;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AlunoManager {

    private List<Aluno> alunos = new ArrayList<>();

    public void adicionaAluno(Aluno aluno) {
        alunos.add(aluno);
        System.out.println("Aluno adicionado com sucesso!");
    }

    public void editarAluno(String nome, String novoPrimeiroNome, String novoSobrenome, String novoRA, String novaUnidade) {
        boolean encontrado = false;

        for (Aluno aluno : alunos) {
            if (aluno.getPrimeiroNome().equalsIgnoreCase(nome)) {
                aluno.setPrimeiroNome(novoPrimeiroNome);
                aluno.setSobrenome(novoSobrenome);
                aluno.setRA(novoRA);
                aluno.setUnidadeDeEnsino(novaUnidade);
                System.out.println("Aluno atualizado com sucesso!");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Aluno não encontrado!");
        }
    }

    public void mostrarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            System.out.println("Lista de Alunos:");
            for (Aluno aluno : alunos) {
                System.out.println(aluno);
            }
        }
    }

    public void removerAluno(String nome) {
        Iterator<Aluno> iterator = alunos.iterator();
        boolean removido = false;

        while (iterator.hasNext()) {
            Aluno aluno = iterator.next();
            if (aluno.getPrimeiroNome().equalsIgnoreCase(nome)) {
                iterator.remove();
                removido = true;
                System.out.println("Aluno removido com sucesso!");
                break;
            }
        }

        if (!removido) {
            System.out.println("Aluno não encontrado!");
        }
    }
}
