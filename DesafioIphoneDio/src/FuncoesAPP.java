import Aplicativos.ApareloTelefonico.Ligar;
import Aplicativos.ApareloTelefonico.Telefone;
import Aplicativos.NavegadorInternet.Navegador;
import Aplicativos.ReprodutorMusical.Musica;

public class FuncoesAPP implements Musica, Telefone, Navegador {


    @Override
    public void navegador() {
        System.out.println("Por funcoes App Adicioanando Nova Aba");
        System.out.println("Por funcoes App Atualizando Pagina");
        System.out.println("Por funcoes App Exibindo Pagina");
    }

    @Override
    public void musica() {
        System.out.println("Por funcoes App Pausando Musica");
        System.out.println("Por funcoes App Selecionando Musica");
        System.out.println("Por funcoes App Tocando Musica");
    }

    @Override
    public void celularfuncao() {
        System.out.println("Por funcoes App Ligando..");
        System.out.println("Por funcoes App Atendendo..");
        System.out.println("Por funcoes App Iniciando Correio de Voz");

    }
}

