package Enums;

public class EstadoBrasileiro {

    public enum EstadoBrasileiroo{
        SAO_PAULO ("SP","São Paulo",11),
        RIO_jANEIRO ("Rj","Rio de Janeiro",25),
        PIAUI ("PI", "Piauí",35),
        MARANHAO ("MA", "Maranhaão",22),
        CEARA ("CE", "Ceará",16);

        private String nome;
        private String sigla;
        private int ibge ;

        private EstadoBrasileiroo(String sigla, String nome, int ibge){
            this.sigla = sigla;
            this.nome = nome;
            this.ibge = ibge;
        }
        public String getSigla(){
            return sigla;
        }
        public String getNome(){
            return  nome;
        }
        public String getNomeMaiusculo(){
            return nome.toUpperCase();
        }
        public int getIbge(){
            return ibge;
        }



    }


}
