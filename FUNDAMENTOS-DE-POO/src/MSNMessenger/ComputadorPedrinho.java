package MSNMessenger;

import MSNMessenger.apps.FacebookMessenger;
import MSNMessenger.apps.MSNMessenger;
import MSNMessenger.apps.ServicoMensagemInstatanea;
import MSNMessenger.apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        //Abrindo o MSN Menssenger
        ServicoMensagemInstatanea smi = null;

        String appEscolhido = "tlg";

        if (appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        if (appEscolhido.equals("tlg"))
            smi = new Telegram();
        if (appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();

        smi.enviarMensagem();
        smi.receberMensagem();






    }
}
