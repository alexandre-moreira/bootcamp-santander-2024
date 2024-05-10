package br.com.junglesoft.stream_api_java;
/**
 * Representa uma operacao que nao aceita nenhum argumento e retorna um resultado do tipo T.@interface
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExemplo {
    public static void main(String[] args) {
        
        // Usar Suplier com expressao lambda para fornecer um saudacao personalizada.@interface
        Supplier<String> saudacao = () -> "Ola, seja bem-vindo(a)";
    
        // Usar Supplier para obter uma lista com 5 saudacoes.@interface
        List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem-vindo(a)")
        .limit(3)
        .toList();
    
        //Imprimir as saudacoes geradas
        listaSaudacoes.forEach(System.out::println);
        
    }
    
}
