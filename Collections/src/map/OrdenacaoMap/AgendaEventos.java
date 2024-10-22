package map.OrdenacaoMap;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventoMap.put(data,evento);
    }

    public void exibirAgenda(){
        Map<LocalDate , Evento> eventosTreeMap = new  TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }
    public void obterProximoEvento(){

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento poximoEvento = null;
        Map<LocalDate , Evento> eventosTreeMap = new  TreeMap<>(eventoMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                poximoEvento = entry.getValue();

                System.out.println("O próximo Evento: " + poximoEvento + "Acontecerá na data " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.APRIL, 23), "Evento 1","Casamento" );
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.JANUARY, 23), "Evento 2","2 anos que se conhecemos" );
        agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10), "Evento 3","evento 5" );
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.OCTOBER, 21), "Evento 4","evento 4" );
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.OCTOBER, 22), "Evento 5","evento 5" );

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();


    }
}
