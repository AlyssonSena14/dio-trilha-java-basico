import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


public class EstruturasExpecionais {
    public static void main(String[] args) {
        try {

        Locale.setDefault(Locale.US);
        Scanner sc = new  Scanner(System.in);

        System.out.println("Digite o Seu Nome:");
        String nome = sc.next();

        System.out.println("Digite o Seu Sobrenome: ");
        String sobrenome = sc.next();

        System.out.println("Digite a Sua Idade: ");
        int idade = sc.nextInt();

        System.out.println("Digite a Sua Altura: ");
        double altura = sc.nextDouble();

        System.out.printf("Meu Nome é %s e o Meu Sobrenome %s, Tenho %d e Tenho de Altura %.2f  ", nome, sobrenome, idade, altura);
        sc.close();
        }

        catch (InputMismatchException e ){
            System.out.println("O Campos Idade e Altura Precisam ser Numéricos ! ");
       }
        
    
    }
    
}
