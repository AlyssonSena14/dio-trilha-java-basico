package MSNMessenger;

public class FacebookMessenger extends ServicoMensagemInstatanea {
    @Override
    public void enviarMensagem() {
        System.out.println("Enviando Mensagem Pelo Facebook");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo Mensagem Pelo Facebook");

    }
}
