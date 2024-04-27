package br.com.junglesoft.lanchonete;

public class Cozinheiro {
    public void adicionarLancheNoBalcao(){
        System.out.println("Adicionado lanche natural no balcao");
    }

    public void adicionarSucoNoBalcao(){
        System.out.println("Adicionado suco no balcao");
    }

    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    public void prepararLanche(){
        System.out.println("Preparando lanche tipo Hamburguer");
    }

    public void prepararVitamina(){
        System.out.println("Preparando suco");
    }

    public void prepararCombo(){
        prepararLanche();
        prepararVitamina();
    }

    public void selecionarIngredientesLanche(){
        System.out.println("Selecionando o pao, salada, ovo e carne");
    }

    public void selecionarIngredientesVitamina(){
        System.out.println("Selecionando fruta, leite e suco");
    }

    public void lavarIngredientes(){
        System.out.println("Lavando ingredientes");
    }
    public void baterVitaminaLiquidificador(){
        System.out.println("Batendo vitamina liquidificador");
    }
    public void fritarIngredientesLanche(){
        System.out.println("Fritando a carne e ovo para o Hamburguer");
    }

    public void pedirParaTrocarGas(Atendente meuAmigo){
        meuAmigo.trocarGas();
    }

    public void pedirParaTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }
    public void pedirIngredientes(Almoxarife almoxarife){
        meuAmigo.entregarIgredientes();
    }
    
}
