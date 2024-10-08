package MSNMessenger.apps;

public abstract class  ServicoMensagemInstatanea{
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarConectadoInternt(){
        System.out.println("Validando se está Conectado a internet");
    }
    protected void salvarHistoricoMensagem() {
            System.out.println("Salvando o Histórico da Mensagem");
    }
}

