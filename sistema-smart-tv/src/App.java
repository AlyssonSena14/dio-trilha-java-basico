public class App {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new  SmartTv();

        System.out.println("Tv Ligada ? " + smartTv.ligada);
        System.out.println( "Canal Atual ? : " + smartTv.canal);
        System.out.println("Volume Atual ? : " + smartTv.volume);

        smartTv.ligar();
        System.out.println(" Novo Status -> Tv Ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> Tv Ligada ?  " + smartTv.ligada);



        smartTv.diminuirVolume();
        smartTv.diminuirVolume();  
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();   
        System.out.println("Novo Status -> Volume Atual ? : " + smartTv.volume);

        System.out.println("Canal Atual : " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal Atual: " + smartTv.canal);





    }
}
