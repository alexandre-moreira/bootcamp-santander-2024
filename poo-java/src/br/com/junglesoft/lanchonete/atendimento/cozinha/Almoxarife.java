package br.com.junglesoft.lanchonete.atendimento.cozinha;

public class Almoxarife {
    private void controlarEntrada(){
        System.out.println("Controlando a entrada dos itens");
    }
    private void controlarSaida(){
        System.out.println("Controlando a saida dos itens");
    }

    void entregarIgredientes(){
        System.out.println("Entregado Ingredientes");
        controlarSaida();
    }

    void trocarGas(){
        System.out.println("Almoxarife trocando o gas");
    }
    
}
