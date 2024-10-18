package Set;

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
        if (!setpalavras.isEmpty()){
            if (setpalavras.contains(palavra)){
                setpalavras.remove(palavra);
            }
        }
        else {
            System.out.println("Nenhuma palavra encontrada !");
        }
        else {
            System.out.println("O conjunto está Vazop");
        }
    }
    public static void main(String[] args) {

    }
}
