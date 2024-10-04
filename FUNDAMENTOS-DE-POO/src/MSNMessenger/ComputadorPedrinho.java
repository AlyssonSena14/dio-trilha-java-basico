package MSNMessenger;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        //Abrindo o MSN Menssenger
        MSNMessenger msn = new MSNMessenger();
        System.out.println("Menssenger");
        msn.enviarMensagem();
        msn.enviarMensagem();

        System.out.println("Facebook");
        FacebookMessenger fcb = new FacebookMessenger();
        fcb.enviarMensagem();
        fcb.receberMensagem();

        System.out.println("Telegram");
        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();




    }
}
