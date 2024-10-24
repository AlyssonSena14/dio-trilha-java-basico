package list.PesquisaList;

import java.util.ArrayList;
import java.util.List;

public class SomaNumero {
    private List<Integer> numeroInteiro;

    public SomaNumero() {
        this.numeroInteiro = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeroInteiro.add(numero);
    }

    public int calcularsoma(){
        int somaTotal = 0;
        for (Integer numero: numeroInteiro){
            somaTotal += numero;
        }
        return somaTotal;
    }

    public int encontrarNumeroMaior() {
        int numeromaior = 0;
        for (int numero: numeroInteiro ){
            if (numero > numeromaior){
                numeromaior = numero;
            }
        }
        return numeromaior;
    }


    public int encontrarNumeroMenor(){
        int numeroMenor = Integer.MAX_VALUE;
        for (int numero: numeroInteiro){
            if (numero < numeroMenor){
                numeroMenor = numero;
            }
        }
        return numeroMenor;

    }

    public void exibirNumeros(){
        System.out.println(numeroInteiro);
    }

    @Override
    public String toString() {
        return "SomaNumero{" +
                "numeroInteiro=" + numeroInteiro +
                '}';
    }

    public static void main(String[] args) {
        SomaNumero somaNumeros = new SomaNumero();

        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(100);
        somaNumeros.calcularsoma();

        somaNumeros.exibirNumeros();
        System.out.println("Total de Numeros: " + somaNumeros.calcularsoma());
        somaNumeros.encontrarNumeroMaior();
        System.out.println("o numero maior e :" + somaNumeros.encontrarNumeroMaior());
        System.out.println("o numero Menor e :" + somaNumeros.encontrarNumeroMenor());

    }
}
