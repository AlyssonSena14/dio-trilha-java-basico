package MSNMessenger;

public class Telegram extends ServicoMensagemInstatanea {
        public void enviarMensagem(){
            System.out.println("Enviando Mensagem Pelo Telegram");
        }

    @Override
    public void receberMensagem() {
            System.out.println("Recebendo Mensagem Pelo Telegram");

    }


}
