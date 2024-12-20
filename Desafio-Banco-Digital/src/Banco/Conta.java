package Banco;

public abstract class Conta implements Iconta {

    protected int numeroConta;
    protected int agencia;
    protected double saldo;
    protected Cliente cliente;

    private static int AGENCIA_PADRAO = 1;

    private static  int SEQUENCIAL = 1;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public void sacar(double valor) {
        saldo -= valor;


    }

    @Override
    public void depositar(double valor) {
        saldo += valor;


    }

    @Override
    public void transferir(double valor,  Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }


    public int getNumeroConta() {
        return numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }
    protected void informacaoComum() {
        System.out.println(String.format("Titular: %s" ,this.cliente.getNome()));
        System.out.println(String.format("CPF: %d", this.cliente.getcpf()));
        System.out.println(String.format("Email: %S", this.cliente.getEmail()));
        System.out.println(String.format("Agencia: %d" ,this.agencia));
        System.out.println(String.format("Numero da conta: %d" ,this.numeroConta));
        System.out.println(String.format("Saldo: %.2f" ,this.saldo));
    }
}
