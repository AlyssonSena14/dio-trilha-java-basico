import java.util.Locale;
import java.util.Scanner;


public class SalarioFuncionario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double salario = entrada.nextDouble();
        double beneficio = entrada.nextDouble();

        salario += beneficio;



        if (salario <= 1100){
            double imposto5 =  salario * 5 / 100;
            System.out.println(imposto5);
        }
        else if (salario <= 2500){
            double imposto10 = salario * 10 / 100;
            System.out.println(imposto10);

        }
        else {
            double imposto15 = salario * 15 / 100;
            System.out.println(imposto15);
        }
        entrada.close();

    }
}
