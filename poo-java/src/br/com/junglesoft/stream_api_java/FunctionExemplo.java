package br.com.junglesoft.stream_api_java;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Representa uma funcao que aceita uma argumento do tipo T e retorna um resultado do tipo R.@interface.
 * É utilizada para transformar ou mapear os elementos do Stream em outros valores ou tipos.
 */

public class FunctionExemplo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 25);

        Function<Integer, Integer> dobrar = numero -> numero * 2;

        List<Integer> numerosDobrados = numeros.stream()
            .map(n -> n * 2)
            .toList();
        
        numerosDobrados.forEach(System.out::println);    
        
    }
    
}
