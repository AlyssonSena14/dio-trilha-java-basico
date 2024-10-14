package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {

        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    public void removeTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t: tarefaList){
            if (t.getDiscricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);

    }
    public int obeterNumeroTotalTarefas(){
        return tarefaList.size();
    }
    public void obeterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa =  new ListaTarefa();

        System.out.println("O número total de Elementos na lista é: " + listaTarefa.obeterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa1");
        listaTarefa.adicionarTarefa("alysson");
        listaTarefa.adicionarTarefa("Tarefa2");
        listaTarefa.adicionarTarefa("lorena");
        System.out.println("O número total de Elementos na lista é: " + listaTarefa.obeterNumeroTotalTarefas());
        listaTarefa.removeTarefa("Tarefa2");
        System.out.println("O número total de Elementos na lista é: " + listaTarefa.obeterNumeroTotalTarefas());


        listaTarefa.obeterDescricoesTarefas();
    }

}
