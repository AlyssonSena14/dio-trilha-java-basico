package Candidatura;

import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {public static void main(String[] args) {
    Locale.setDefault(Locale.US);
   
    String [] candidatos = {"Felipe", "Marcia", "jULIA", "PAULO", "AUGUSTO"};
    for (String candidato: candidatos) {
        entrandoEmContato(candidato);

    } 
    

}

static void entrandoEmContato(String candidato){
    int tentativasRealizadas =1;
    boolean continuarTentando = true;
    boolean atendeu = false; 

    do { 
        atendeu = atender();
        continuarTentando = !atendeu;
        
        if (continuarTentando)
        tentativasRealizadas ++;
        else
            System.out.println("CONTATO REALIZADO COM SUCESSO");
    
        
    } while (continuarTentando && tentativasRealizadas < 3);

    if (atendeu){
        System.out.println(" CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA ");
    }
    else {
        System.out.println(" NÃO CONSEGUIMOS CONTATO COM " + candidato + "NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
    }

    
}



static boolean  atender (){
    return new Random().nextInt(3)== 1;
}


static  void  imprimirSelecionados () {
    String [] candidatos = {"Felipe", "Marcia", "jULIA", "PAULO", "AUGUSTO"}; 

    System.err.println("Imprimindo a lista de candidatos informando o indice do elemento");
    for (int indice = 0; indice < candidatos.length; indice ++){
        System.out.println("O Candidato de nu  " + (indice+1) + " é " + candidatos[indice]);
    }  
    

}
static void selecaoCandidatos(){
    String [] candidatos = {"Felipe", "Marcia", "jULIA", "PAULO", "AUGUSTO", "MONICA", "fABRICIO", "MIRELA", "DANIELA", "jORGE"};

    int candidatosSelecionados = 0;
    int candidatosAtual = 0;
    double salarioBase = 2000.0;

    while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
        String candidato = candidatos[candidatosAtual];
        double salarioPrentendido = valorPretendido();

        System.out.println("O candidato " + candidato + " Solicitou este Valor de Salário " + salarioPrentendido);
        if (salarioBase >=  salarioPrentendido){
            System.out.println("O candidato " + candidato + " Foi Selecionado para a vaga");
            candidatosSelecionados++; 

        }
        candidatosAtual++;
    }

}

static  double  valorPretendido(){
    return  ThreadLocalRandom.current().nextDouble(1800, 2200);
}

static void analisarCandidato(double salarioPrentendido){
    double salarioBase = 2000.0;
    if (salarioBase > salarioPrentendido){
        System.out.println("Ligar Para o Candidato");
    }
    else if (salarioBase == salarioPrentendido) {
        System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
    }
    else{
        System.out.println("Aguardando o Resultado dos  Demais Candidatos");
    }
}

}
