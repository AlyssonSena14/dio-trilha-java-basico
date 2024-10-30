package Banco;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Cliente alysson = new Cliente();
        Scanner sc = new Scanner(System.in);
        alysson.setNome("Alysson", 15792357, "Alyssonsena566@gmail.com");


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
