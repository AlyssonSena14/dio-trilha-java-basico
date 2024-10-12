import Aplicativos.ApareloTelefonico.Atender;
import Aplicativos.ApareloTelefonico.IniciarCorreioVoz;
import Aplicativos.ApareloTelefonico.Ligar;
import Aplicativos.ApareloTelefonico.Telefone;
import Aplicativos.NavegadorInternet.ExibirPagina;
import Aplicativos.NavegadorInternet.Navegador;
import Aplicativos.NavegadorInternet.adicionarNovaAba;
import Aplicativos.ReprodutorMusical.Musica;
import Aplicativos.ReprodutorMusical.Pausar;

public class Iphone {
    public static void main(String[] args) {
     Telefone telefone = new Atender();
       telefone.celularfuncao();
        Telefone telefone1 = new Ligar();
        telefone1.celularfuncao();
        Telefone telefone2 = new IniciarCorreioVoz();
        telefone2.celularfuncao();
        Navegador navegador = new adicionarNovaAba();
           navegador.navegador();
        Musica musica = new Pausar();
        musica.musica();



        FuncoesAPP fc = new  FuncoesAPP();
        fc.celularfuncao();
        fc.musica();
        fc.navegador();

    }




}




