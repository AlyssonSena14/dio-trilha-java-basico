package Set.OrdenacaoSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;

public class GerenciadorAlunos {
    private Set<Aluno> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media){
        alunosSet.add( new Aluno(nome,matricula,media));
    }

    public void removerAluno(long matricula) {
        Aluno alunoParaRemover = null;
        if (!alunosSet.isEmpty()) {
            for (Aluno a : alunosSet) {
                if (a.getMatricula() == matricula) {
                    alunoParaRemover = a;
                    break;
                }
            }
            alunosSet.remove(alunoParaRemover);
        }
        else {
            throw new RuntimeException("O conjunto está vazio!");
        }
        if (alunoParaRemover == null){
            System.out.println("Matricula não Encontrada!");
        }


    }
    public void exibirAlunoPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunosSet);
        if (!alunosSet.isEmpty()){
            System.out.println(alunosPorNome);
        }
        else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public void exibirAlunoPorNota(){
        Set<Aluno> alunoPorNota = new TreeSet<>(new  ComparatorNota());
        if (!alunosSet.isEmpty()){
            alunoPorNota.addAll(alunosSet);
            System.out.println(alunoPorNota);
        }
        else {
            System.out.println("O conjunto está vazio!");
        }
    }



    public void exibirAlunos(){
        System.out.println(alunosSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciarAlunos = new GerenciadorAlunos();
        gerenciarAlunos.adicionarAluno("alysson", 1554, 10.00);
        gerenciarAlunos.adicionarAluno("lorena", 1553, 8.00);
        gerenciarAlunos.adicionarAluno("alana", 1552, 4.00);
        gerenciarAlunos.adicionarAluno("Felipe", 4445, 5.00);
        gerenciarAlunos.adicionarAluno("Vitoria", 3585, 7.00);
        gerenciarAlunos.exibirAlunos();
        gerenciarAlunos.removerAluno(1553);
        gerenciarAlunos.removerAluno(0655);
        gerenciarAlunos.exibirAlunos();
        gerenciarAlunos.exibirAlunoPorNome();
        gerenciarAlunos.exibirAlunoPorNota();


    }


}
