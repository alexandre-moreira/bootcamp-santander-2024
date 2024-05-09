package br.com.junglesoft.collections_java_api.map.Ordenacao;

import java.time.LocalDate;

public class Evento {
    private LocalDate data;
    private String nome;
    private String atracao;

    public Evento(LocalDate data, String nome, String atracao) {
        this.data = data;
        this.nome = nome;
        this.atracao = atracao;
    }

    public LocalDate getData() {
        return data;
    }

    public String getNome() {
        return nome;
    }

    public String getAtracao() {
        return atracao;
    }

    @Override
    public String toString() {
        return "Evento [data=" + data + ", nome=" + nome + ", atracao=" + atracao + "]\n";
    }
    
}