package br.com.junglesoft.stream_api_java;
/**
 * Representa uma operacao que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T.
 * É usada para realizar operacoes de reducao em pares de elementosm como somar números ou combinar objetos.
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
/**
 * Representa uma operacao que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T.
 * É usada para realizar operacoes de reducao em pares de elementos, como somar numeros ou combinar  objetos.
*/
public class BinaryOperatorExemplo {
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 5);
    
        BinaryOperator<Integer> somar = Integer::sum;
    
        int resultado = numeros.stream()
            .reduce(0, Integer::sum);
        
        System.out.println("A soma dos  números é: " + resultado);    

    }
}
