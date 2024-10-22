package Set.PesquisaSet;

public class Tarefa {
    private String discricao;
    public  boolean concluida;

    public Tarefa(String discricao) {
        this.discricao = discricao;
        this.concluida = false;
    }

    public String getDiscricao() {
        return discricao;
    }
    public boolean isConcluida(){
        return concluida;
    }
    public void setConcluida(boolean concluida){
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return "Tarefa " +
                "discricao'" + discricao + '\'' +
                ", concluida=" + concluida +
                '}';
    }
}
