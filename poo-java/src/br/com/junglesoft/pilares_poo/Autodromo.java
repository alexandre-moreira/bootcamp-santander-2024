package br.com.junglesoft.pilares_poo;

public class Autodromo {
    
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("9878987");
        //jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("43231344");
        //z400.ligar();

        Veiculo coringa = jeep;
        coringa.ligar();
    }
    
}
