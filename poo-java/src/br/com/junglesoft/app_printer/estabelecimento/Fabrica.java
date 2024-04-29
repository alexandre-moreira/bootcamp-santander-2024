package br.com.junglesoft.app_printer.estabelecimento;

import br.com.junglesoft.app_printer.equipamentos.copiadora.Copiadora;
import br.com.junglesoft.app_printer.equipamentos.digitalizadora.Digitalizadora;
import br.com.junglesoft.app_printer.equipamentos.impressora.Deskjet;
import br.com.junglesoft.app_printer.equipamentos.impressora.Impressora;
import br.com.junglesoft.app_printer.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        Impressora em = new EquipamentoMultifuncional();

        Impressora impressora = em;
        Digitalizadora digitalizadora =em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
