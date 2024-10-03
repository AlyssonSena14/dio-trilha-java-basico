package Pilares_do_POO;

public class Carro extends Veiculo {

    public void ligar(){
        conferirCombustivel();
        confereCambio();
        System.out.println("CARRO LIGADO");
    }
    private void conferirCombustivel(){
        System.out.println("CONFERINDO COMBUSTIVEL");
    }
    private void confereCambio(){
        System.out.println("CONFERINDO CAMBIO EM P");
    }


}
