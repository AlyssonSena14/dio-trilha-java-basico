import java.util.Scanner;

public class Main {

    // Função para calcular a velocidade média de conexão de internet
    public static double calcularVelocidadeMedia(String[] velocidades) {
        int total = 0;
        for(String velocidade: velocidades){
            int velocidadeint = Integer.valueOf(velocidade);
            total += velocidadeint;
            System.out.println(velocidade);
        }
        float media = total / velocidades.length;

        // TODO: Some todas as velocidades registradas e calcule a média
        return  media;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        // Calculando a velocidade média de conexão
        double velocidadeMedia = calcularVelocidadeMedia(velocidades);

        // Exibindo a velocidade média de conexão
        System.out.println((int)velocidadeMedia + " Mbps");

        scanner.close();
    }
}