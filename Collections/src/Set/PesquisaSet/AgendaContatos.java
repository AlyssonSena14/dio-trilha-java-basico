package Set.PesquisaSet;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome,numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }


    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet){
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }


    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c: contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return  contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Alana sena" , 819853416);
        agendaContatos.adicionarContato("Bruna" , 819853417);
        agendaContatos.adicionarContato("luna" , 819853418);
        agendaContatos.adicionarContato("Alana barbosa" , 819853415);
        agendaContatos.adicionarContato("Alana silva " , 819853415);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Alana"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Alana silva", 819853419));

        agendaContatos.exibirContatos();



    }
}
