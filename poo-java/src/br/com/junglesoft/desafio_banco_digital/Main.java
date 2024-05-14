package br.com.junglesoft.desafio_banco_digital;

public class Main {
    public static void main(String[] args) {
        Cliente alexandre = new Cliente();
        alexandre.setNome("Alexandre");

        Conta cc = new ContaCorrente(alexandre);
        Conta poupanca = new ContaPoupanca(alexandre);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
    
}
