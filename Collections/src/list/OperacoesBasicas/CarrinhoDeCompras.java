package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras (){
        this.itemList = new ArrayList<>();
    }
    public void adicionarItem(String nome, Double preco, int quantidade){
        Item item   = new Item(nome,preco,quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            itemList.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista esta vazia!");
        }
    }
    public Double calcularvalorTotal(){
        double valorTotal = 0d;
        if (!itemList.isEmpty()){
            for (Item item : itemList){
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        }
        else {
            throw new RuntimeException("A lista está vazia!");
        }

    }
    public void exbirItemList(){
        if (!itemList.isEmpty()){
            System.out.println(itemList);
        }
        else {
            System.out.println("A lista está vazia!");
        }
    }

    public String toString() {
        return "CarrinhoDeCompras{" +
                "itemList=" + itemList +
                '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("sofa ",500.00 , 1 );
        carrinho.adicionarItem("tv" , 2000.00 , 1 );
        carrinho.adicionarItem("novo" , 10.00 , 500);
        carrinho.adicionarItem("novo" , 10.00 , 5000 );
        carrinho.adicionarItem("novo" , 10.00 , 50000 );;
        carrinho.adicionarItem("cama", 1500.00, 1);

        carrinho.exbirItemList();

        carrinho.removerItem("novo");

        carrinho.exbirItemList();

        System.out.println("O valor total de compra é = " + carrinho.calcularvalorTotal());
    }
}


