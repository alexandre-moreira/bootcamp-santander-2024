package br.com.junglesoft.collections_java_api.generics;

import java.util.HashSet;
import java.util.Set;

public class GenericsExemploSet {
    public static void main(String[] args) {

        // Exemplo sem generics
        Set conjuntoSemGenerics = new HashSet();
        conjuntoSemGenerics.add("Elemento 1");
        conjuntoSemGenerics.add(10);

        // Exemplo com generics
        Set<String> conjuntoGenerics = new HashSet<>();
        conjuntoGenerics.add("Elemento 1");   
        conjuntoGenerics.add("Elemento 2");

        // Iterando sobre  o conjunto com Generics
        for(String elemento : conjuntoGenerics){
            System.out.println(elemento);
        }

        //Iterando sobre o elemento sem Generics(Necessário fazer cast).
        for(Object elemento : conjuntoSemGenerics){
            String str = (String) elemento;
            System.out.println(str);
        }

    }

}
