
import java.util.Locale;
import java.util.Scanner;



public class ContaTerminal{
    public static void main(String[] args) {
        
    
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite o seu nome : ");
        String nome = sc.nextLine();
        System.out.print("Digite o numero da sua agencia: ");
        String agencia = sc.next();
        System.out.print("Digite o numero da sua conta: ");
        int numeroDaConta = sc.nextInt();
        System.out.print("Digite o saldo inicial: ");
        double saldo = sc.nextDouble();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s conta %d e seu saldo %.2f já está disponível para saque",nome, agencia, numeroDaConta, saldo);

        sc.close();                          
        
    }
}
