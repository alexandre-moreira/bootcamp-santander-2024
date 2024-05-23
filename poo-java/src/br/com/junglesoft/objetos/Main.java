package br.com.junglesoft.objetos;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Alexandre");
        funcionario.setSalario(5000.0f);
        funcionario.setCpf("123.543.083-00");
        funcionario.apresentar();
        System.out.println("====================");
        Desenvolvedor desenvolvedor = new Desenvolvedor();
        desenvolvedor.setNome("Alex");
        desenvolvedor.setSalario(8000.0f);
        desenvolvedor.setCpf("333.444.555-66");
        desenvolvedor.setLinguagem("Java");
        desenvolvedor.setFramework("Springboot");
        desenvolvedor.apresentar();
    }
}
