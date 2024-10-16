package list.OrdenacaoDePessoas;

import java.util.Comparator;

public class Pessoas implements Comparable <Pessoas>{
    private String nome;
    private  int idade;
    private double altura;

    public Pessoas(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public int compareTo(Pessoas p) {
        return Integer.compare(idade, p.idade);
    }
}

class ComparatorPorAltura implements Comparator <Pessoas>{
    public int compare(Pessoas p1, Pessoas p2 ){
        return Double.compare(p1.getAltura(), p2.getAltura());

    }

}
