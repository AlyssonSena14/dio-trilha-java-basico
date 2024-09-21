import java.util.Scanner;


public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.print("Digite o Primeiro Número: ");
        int parametroUm = terminal.nextInt();
        System.out.print("Digite o Segundo Número:" );
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
            
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
              
        }

        
    terminal.close();
}

static  void contar (int parametroUm, int parametroDois ) throws ParametrosInvalidosException{
    
    if (parametroUm >= parametroDois){
        throw new ParametrosInvalidosException();
        
    }
    int i;
    int contagem = parametroDois - parametroUm;
    for( i =  contagem; i >= 0 ; i--) {
        System.out.println("comtagem " + i);
        if(i == 0){System.out.println("Contador finalizado!");}
        
    }
   

        
    } 


}


