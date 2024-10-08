package MSNMessenger.apps;

public class Telegram extends ServicoMensagemInstatanea {
    public void enviarMensagem(){
        validarConectadoInternt();
            System.out.println("Enviando Mensagem Pelo Telegram");
        }

    @Override
    public void receberMensagem() {
            System.out.println("Recebendo Mensagem Pelo Telegram");

    }


}
