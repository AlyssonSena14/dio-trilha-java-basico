package Lanchonete.atendimento.cozinha;

public class Atendente {
    public void servindoMesa(){
        System.out.println("SERVINDO MESA");
    }
    public void  pegarLancheCozinha() {
        System.out.println("PEGANDO LANCHE NA COZINHA");
    }
    public void receberPagamento(){
        System.out.println("RECEBENDO PAGAMENTO");
    }

    private void pegarPedidoBalcao(){
        System.out.println("PEGANDO O PEDIDO NO BALCAO");
    }
}
