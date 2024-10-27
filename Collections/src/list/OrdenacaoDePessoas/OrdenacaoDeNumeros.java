package list.OrdenacaoDePessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class OrdenacaoDeNumeros  {
    private List<Integer> oredenarNumeros;

    int numero;

    public OrdenacaoDeNumeros() {
        this.oredenarNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        oredenarNumeros.add(numero);
    }
    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendente = new ArrayList<>(this.oredenarNumeros);
        if (!oredenarNumeros.isEmpty()){
            Collections.sort(numerosAscendente);
            return numerosAscendente;
        }
        else {
            throw new RuntimeException("A lista está Vazia");
        }

    }
    public List<Integer> ordenarDescendente() {
        List<Integer> numerosDescendente = new ArrayList<>(this.oredenarNumeros);
        if (!oredenarNumeros.isEmpty()) {
            numerosDescendente.sort(Collections.reverseOrder());
            return numerosDescendente;
        }
        else {
            throw new RuntimeException("A lista está Vazia");
        }

    }

    public void exibirPessoas(){
        if (!oredenarNumeros.isEmpty()) {
            System.out.println(oredenarNumeros);
        }
        else {
            System.out.println("Numeros vazios !");
        }
    }


    @Override
    public String toString() {
        return "OrdenacaoDeNumeros{" +
                "oredenarNumeros=" + oredenarNumeros +
                '}';
    }
    
    public static void main(String[] args) {
        OrdenacaoDeNumeros ordenacaonumero = new OrdenacaoDeNumeros();
        ordenacaonumero.adicionarNumero(1);
        ordenacaonumero.adicionarNumero(10);
        ordenacaonumero.adicionarNumero(9);
        ordenacaonumero.adicionarNumero(5);
        ordenacaonumero.exibirPessoas();
        System.out.println("numeros Ascedente" + ordenacaonumero.ordenarAscendente());
        System.out.println("numeros Descedente" + ordenacaonumero.ordenarDescendente());

    }
}

