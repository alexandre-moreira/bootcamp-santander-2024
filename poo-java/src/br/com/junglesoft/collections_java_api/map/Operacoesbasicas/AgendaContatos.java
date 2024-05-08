package br.com.junglesoft.collections_java_api.map.Operacoesbasicas;

import java.util.HashMap;
import java.util.Map;


public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos(){
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisaPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Alexandre", 123456);
        agendaContatos.adicionarContato("Alexandre", 5665);
        agendaContatos.adicionarContato("Alexandre Moreira", 111111111);
        agendaContatos.adicionarContato("Alexandre DIO", 6549987);
        agendaContatos.adicionarContato("Maria Silva", 1111111);
        agendaContatos.adicionarContato("Alexandre", 44444);

        agendaContatos.exibirContatos();
        
        agendaContatos.removerContato("Maria Silva");
        agendaContatos.exibirContatos();

        System.out.println("O numero é: " + agendaContatos.pesquisaPorNome("Alexandre DIO"));


    }
}
