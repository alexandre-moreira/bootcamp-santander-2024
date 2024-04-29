package br.com.junglesoft.app_printer.equipamentos.multifuncional;

import br.com.junglesoft.app_printer.equipamentos.copiadora.Copiadora;
import br.com.junglesoft.app_printer.equipamentos.digitalizadora.Digitalizadora;
import br.com.junglesoft.app_printer.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{
    

    
    public void copiar() {
        System.out.println("Copiando via equipamento Multifuncional");
    }

    public void digitalizar() {
        System.out.println("Digitalizando via equipamento Multifuncional");
    }

    public void imprimir() {
        System.out.println("Imprimindo via equipamento Multifuncional");
    }
}
