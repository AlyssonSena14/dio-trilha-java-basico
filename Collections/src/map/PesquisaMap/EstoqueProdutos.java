package map.PesquisaMap;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto>estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProdutos(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdtos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto p: estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return  valorTotalEstoque;
    }
    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }

            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProdtos();

        estoque.adicionarProdutos(1L , "Tv A", 10, 5.0);
        estoque.adicionarProdutos(3L , "fogao B", 5, 10.0);
        estoque.adicionarProdutos(2L , "geladeira  c", 2, 15.0);

       estoque.exibirProdtos();

       System.out.println("Valor total do Estoque: R$" + estoque.calcularValorTotalEstoque());
       System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());





    }

}
