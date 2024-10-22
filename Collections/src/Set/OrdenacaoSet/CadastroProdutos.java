package Set.OrdenacaoSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }
    public Set <Produto> exibirProdutoPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirPordutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new  comparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L ,"panela", 100.00, 5 );
        cadastroProdutos.adicionarProduto(2L ,"geladeira", 500.00, 7 );
        cadastroProdutos.adicionarProduto(3L ,"fogão", 50.00, 10 );
        cadastroProdutos.adicionarProduto(0L ,"Tv", 200.00, 2 );
        cadastroProdutos.adicionarProduto(10L ,"Microndas", 150.00, 2 );

        System.out.println(cadastroProdutos.produtoSet);





    }


}
