package MSNMessenger.apps;

import MSNMessenger.apps.ServicoMensagemInstatanea;

public class  MSNMessenger extends ServicoMensagemInstatanea {
    @Override
    public void enviarMensagem() {
        validarConectadoInternt();
        System.out.println("Enviando Mensagem Pelo MSN Menssenger");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo Mensagem Pelo MSN Menssenger");


    }
}
