package Set.PesquisaSet;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {
    private Set<Tarefa> tarefaSet;

    public ListaTarefa() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDiscricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }

            }
            tarefaSet.remove(tarefaParaRemover);
        } else {
            System.out.println("O conjunto está vazio");
        }
        if (tarefaParaRemover == null){
            System.out.println("Tarefa não Encontrada!");
        }
    }
    public void exibirTarefas (){
        if (!tarefaSet.isEmpty()){
            System.out.println(tarefaSet);
        } else{
            System.out.println("Tarefa não encontrada!");
        }
    }

    public int contarTarefa(){
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t: tarefaSet)
            if (t.isConcluida()){
                tarefasConcluidas.add(t);
            }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPedentes(){
        Set<Tarefa> tarefasNaoConcluidas = new HashSet<>();
        for (Tarefa t: tarefaSet){
            if (!t.concluida){
                tarefasNaoConcluidas.add(t);
            }
        }
        return tarefasNaoConcluidas;
    }

    public void marcarTarefasConcluidas(String descricao){
        for (Tarefa t : tarefaSet){
            if (t.getDiscricao().equalsIgnoreCase(descricao)){
                t.setConcluida(true);
            }
        }
    }

    public void marcarTarefasPendente(String descricao){
        Tarefa tarefaParaMarcarComoPedente = null;
        for (Tarefa t: tarefaSet){
            if (t.getDiscricao().equalsIgnoreCase(descricao)){
                tarefaParaMarcarComoPedente = t;
                break;
            }
        }
        if (tarefaParaMarcarComoPedente != null){
            if (tarefaParaMarcarComoPedente.isConcluida()){
                tarefaParaMarcarComoPedente.setConcluida(false);

            }
        }
        else {
            System.out.println("Tarefa não Encontrada na lista.");
        }
    }
    public void limparTarefas(){
        if (tarefaSet.isEmpty()){
            System.out.println("A lista está Vazia!");
        } else{
            tarefaSet.clear();
        }
    }




    public static void main(String[] args) {
        ListaTarefa listasTarefas = new ListaTarefa();

        listasTarefas.adicionarTarefa("Estudar Java");
        listasTarefas.adicionarTarefa("Fazer exercícios físicos");
        listasTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listasTarefas.adicionarTarefa("Ler livro");
        listasTarefas.adicionarTarefa("Preparar apresentação");

        // Exibindo as tarefas na lista
        listasTarefas.exibirTarefas();

        // Removendo uma tarefa
        listasTarefas.removerTarefa("Fazer exercícios físicos");
        listasTarefas.exibirTarefas();

        // Contando o número de tarefas na lista
        System.out.println("Total de tarefas na lista: " + listasTarefas.contarTarefa());

        // Obtendo tarefas pendentes
        System.out.println(listasTarefas.obterTarefasPedentes());

        // Marcando tarefas como concluídas
        listasTarefas.marcarTarefasConcluidas("Ler livro");
        listasTarefas.marcarTarefasConcluidas("Estudar Java");

        // Obtendo tarefas concluídas
        System.out.println(listasTarefas.obterTarefasConcluidas());

        // Marcando tarefas como pendentes
        listasTarefas.marcarTarefasPendente("Estudar Java");
        listasTarefas.exibirTarefas();

        // Limpando a lista de tarefas
        listasTarefas.limparTarefas();
        listasTarefas.exibirTarefas();


    }
}
