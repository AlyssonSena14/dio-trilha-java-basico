package map.operacaoBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContatos(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }
    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }
    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContatos("Carlos cavalcante", 12345678);
        agendaContatos.adicionarContatos("Carlos", 12345678);
        agendaContatos.adicionarContatos("Carlos dio", 123456785);
        agendaContatos.adicionarContatos("lucas", 1234567891);
        agendaContatos.adicionarContatos("pedro", 123456789);
        agendaContatos.adicionarContatos("claudia", 1234567);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("lucas");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Carlos dio"));

    }

}
