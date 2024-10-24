package list.OperacoesBasicas;

public class Item {
    private String nome;
    private double preco;
    private int quantidade;


    public Item(String nome, Double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
    public int getQuantidade(){
        return quantidade;
    }

    @Override
    public String toString() {
        return nome + preco + quantidade;
    }
}
