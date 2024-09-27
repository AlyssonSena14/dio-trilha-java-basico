package Lanchonete.atendimento.cozinha.cozinha;

public class Cozinheiro {
    public void adicionarLancheNoBalcao(){
        System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGUER NO  BALCAO");
    }
    public void adicionarSucoNoBalcao(){
        System.out.println("ADICIONANDO SUCO NO BALCAO");
    }
    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
    public void prepararLanche(){
        System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER ");
    }
    public void prepararVitamina(){
        System.out.println("PREPARANDO SUCO");
    }
    public void prepararCombo(){
        prepararLanche();
        prepararVitamina();
    }
    public void selecionarIngredientesLanche(){
        System.out.println("SELECIONANDO O PÃO, SALADA, OVO E CARNE");
    }
    public void selecionarIngredientesVitamina(){
        System.out.println("SELECIONANDO FRUTA, LEITE, E SUCO");
    }
    public void lavandoIngredientes(){
        System.out.println("LAVANDO INGREDIENTES");
    }
    public void baterVitaminaLiquidificador(){
        System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
    }
    public void fritarIngredientesLanche(){
        System.out.println("FRITANDO A CARNE E OVO PARA O HAMBURGUER");
    }
    public void pedirParaTrocarGas(Almoxarife meuamigo){
        meuamigo.trocarGas();
    }
    public void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }

}
