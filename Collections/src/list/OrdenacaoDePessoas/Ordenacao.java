package list.OrdenacaoDePessoas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Ordenacao {
    private List<Pessoas> pessoasList;

    public Ordenacao() {
        this.pessoasList = new ArrayList<>();
    }

    public void adicionarPessoas (String nome, int idade, double altura){
        pessoasList.add(new Pessoas(nome, idade, altura));
    }
    public List <Pessoas> ordenarPorIdade(){
        List<Pessoas> pessoasPorIdade = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List <Pessoas> ordenarPorAltura(){
        List<Pessoas> pessoasPorAltura = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }




    public static void main(String[] args) {
        Ordenacao ordenacao = new Ordenacao();


        ordenacao.adicionarPessoas("nome 1", 20, 1.56 );
        ordenacao.adicionarPessoas("nome 2", 30, 1.80 );
        ordenacao.adicionarPessoas("nome 3", 25, 1.70 );
        ordenacao.adicionarPessoas("nome 4", 17, 1.56 );

        System.out.println(ordenacao.ordenarPorAltura());
        System.out.println(ordenacao.ordenarPorIdade());

    }










}
