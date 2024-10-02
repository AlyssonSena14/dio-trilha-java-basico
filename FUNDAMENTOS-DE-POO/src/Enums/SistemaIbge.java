package Enums;

public class SistemaIbge {
    public static void main(String[] args) {
        for (EstadoBrasileiro.EstadoBrasileiroo e: EstadoBrasileiro.EstadoBrasileiroo.values()){
            System.out.println(e.getSigla() +  " - " + e.getNome());
        }
        EstadoBrasileiro.EstadoBrasileiroo eb = EstadoBrasileiro.EstadoBrasileiroo.SAO_PAULO;
        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getNomeMaiusculo());
        System.out.println(eb.getIbge());


    }
}
