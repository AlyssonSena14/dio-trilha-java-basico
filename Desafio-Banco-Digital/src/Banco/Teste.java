package Banco;

public class Teste {
    public static void main(String[] args) {
        Cliente alysson = new Cliente();
        alysson.setNome("Alysson");

        Conta cc = new ContaCorrente(alysson);
        Conta cp = new ContaPoupanca(alysson);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        cc.depositar(150.00);
        cc.transferir(100.00, cp);

        cp.imprimirExtrato();
        cc.imprimirExtrato();




    }
}
