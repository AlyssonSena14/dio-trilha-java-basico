package map.operacaoBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionário {
    private Map<String, String> dicionarioMap;

    public Dicionário() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavras(String palavra, String discricao){

        dicionarioMap.put(palavra, discricao);
    }
    public void removerPalavras(String palavra){
        if (!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }
    }
    public void exibirPalavras(){
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra) {
        String definicao = dicionarioMap.get(palavra);
        if (definicao != null) {
            return definicao;
        }
        return "Linguagem não encontrada no dicionário.";
    }


    public static void main(String[] args){
            Dicionário dicionárioMap = new Dicionário();

        dicionárioMap.exibirPalavras();
        dicionárioMap.adicionarPalavras("sigilo", "o que permanece escondido da vista ou do conhecimento; segredo.");
        dicionárioMap.adicionarPalavras("teste", "teste 3");
        dicionárioMap.adicionarPalavras("boraVer", "novo teste2");
        dicionárioMap.adicionarPalavras("semivogal", "novo teste1");
        dicionárioMap.adicionarPalavras("pesquisar", "descricao brabaa");
        dicionárioMap.exibirPalavras();
        dicionárioMap.removerPalavras("pesquisar");

        String definicao = dicionárioMap.pesquisarPorPalavra("sigilo");
        dicionárioMap.exibirPalavras();
        System.out.println("Definição da linguagem 'sigilo': " + definicao);

    }


}
