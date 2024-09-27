package Lanchonete;

import Lanchonete.area.cliente.Cliente;
import Lanchonete.atendimento.cozinha.Atendente;
import Lanchonete.atendimento.cozinha.cozinha.Almoxarife;
import Lanchonete.atendimento.cozinha.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();

        //ações que estabelecimento precisa ter ciência
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        Almoxarife almoxarife = new Almoxarife();
        //  // ações que não precisam esta disponíveis para toda aplicação
        almoxarife.controlarEntrada();
        almoxarife.controlarSaida();

        Atendente atendente = new Atendente();
        atendente.servindoMesa();
        atendente.receberPagamento();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();



    }

}
