package br.com.junglesoft.stream_api_java;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/** 
 * Representa uma operacao que aceita um argumento do tipo T e nao retorna nenhum resultado.abstract
 * É utilizada principalmente para realizar acoes, ou efeitos colaterais nos elementos do Stream sem modificar, ou
 * retornar um valor.
*/

public class ConsumerExemplo {
public static void main(String[] args) {
    // Criar uma lista de numeros inteiros
    List <Integer> numeros = Arrays.asList(1,2,3,4,5);

    //Usar o Consumer com expressao lambda para imprimir numeros pares
    Consumer<Integer> imprimirNumeroPar = numero -> {
        if(numero % 2 == 0){
            System.out.println(numero);
        }
    };

    // Usar o Consumer para imprimir números pares no Stream
    numeros.stream()
        .filter(n -> n % 2 == 0)
        .forEach(System.out::println);
    }
    
}
