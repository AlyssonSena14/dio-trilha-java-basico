package MSNMessenger.apps;

import MSNMessenger.apps.ServicoMensagemInstatanea;

public class FacebookMessenger extends ServicoMensagemInstatanea {
    @Override
    public void enviarMensagem() {
        validarConectadoInternt();
        System.out.println("Enviando Mensagem Pelo Facebook");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo Mensagem Pelo Facebook");

    }
}
