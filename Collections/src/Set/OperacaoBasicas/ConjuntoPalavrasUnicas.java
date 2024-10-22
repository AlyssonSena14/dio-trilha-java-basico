package Set.OperacaoBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> setpalavras;

    public ConjuntoPalavrasUnicas(){
        this.setpalavras = new HashSet<>();
    }

    public void adicionarPalavras(String palavra){
      setpalavras.add(palavra);
    }

    public void removerPalavra(String palavra){
        if (!setpalavras.isEmpty()) {
            if (setpalavras.contains(palavra)) {
                setpalavras.remove(palavra);
            } else {
                System.out.println("Nenhuma palavra encontrada !");
            }
        }
        else {
            System.out.println("O conjunto está Vazop");
        }
    }
    public boolean vereficarPlavra(String palavra){
        return setpalavras.contains(palavra);

    }


    public void exibirPalavras(){
        if (!setpalavras.isEmpty()){
            System.out.println(setpalavras);
        }
        else {
            System.out.println("O conjunto está vazio");
        }

    }


    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.exibirPalavras();

        conjuntoPalavrasUnicas.adicionarPalavras("alysson");
        conjuntoPalavrasUnicas.adicionarPalavras("alana");
        conjuntoPalavrasUnicas.adicionarPalavras("lorena");
        conjuntoPalavrasUnicas.adicionarPalavras("felipe");

        conjuntoPalavrasUnicas.exibirPalavras();
        conjuntoPalavrasUnicas.removerPalavra("alysson");
        conjuntoPalavrasUnicas.exibirPalavras();
        System.out.println("Existem essa Palavras Dentro do Conjunto palavra ? " + conjuntoPalavrasUnicas.vereficarPlavra("lorena"));
        conjuntoPalavrasUnicas.exibirPalavras();







    }
}
