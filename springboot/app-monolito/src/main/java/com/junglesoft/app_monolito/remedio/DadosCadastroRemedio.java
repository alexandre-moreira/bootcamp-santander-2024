package com.junglesoft.app_monolito.remedio;

public record DadosCadastroRemedio (
        String nome,
        Via via,
        String lote,
        String quantidade,
        String validade,
        Laboratorio laboratorio){
}
