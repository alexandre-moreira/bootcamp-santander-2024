package br.com.junglesoft.lanchonete.atendimento.cozinha;

import br.com.junglesoft.lanchonete.atendimento.Atendente;

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

    private void prepararLanche(){
        System.out.println("Preparando lanche tipo Hamburguer");
    }

    private void prepararVitamina(){
        System.out.println("Preparando suco");
    }

    private void prepararCombo(){
        prepararLanche();
        prepararVitamina();
    }

    private void selecionarIngredientesLanche(){
        System.out.println("Selecionando o pao, salada, ovo e carne");
    }

    private void selecionarIngredientesVitamina(){
        System.out.println("Selecionando fruta, leite e suco");
    }

    private void lavarIngredientes(){
        System.out.println("Lavando ingredientes");
    }
    private void baterVitaminaLiquidificador(){
        System.out.println("Batendo vitamina liquidificador");
    }
    private void fritarIngredientesLanche(){
        System.out.println("Fritando a carne e ovo para o Hamburguer");
    }

    private void pedirParaTrocarGas(Atendente meuAmigo){
        meuAmigo.trocarGas();
    }

    private void pedirParaTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }
    
    private void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIgredientes();
    }
    
}
