package Pilares_do_POO;

public class Autodromo {
    public static void main(String[] args) {
        Carro civic = new  Carro();
        //civic.ligar();

        civic.setChassi("891852");

    Moto z400 =  new  Moto();
    //z400.ligar();
   // z400.setChassi("235512");

    Veiculo coringa = z400;
    coringa.ligar();

    }


}
