package br.com.junglesoft.objetos;

public class Funcionario {
    // Atributos
    private String nome;
    private float salario;
    private String cpf;

    // Construtores
    public Funcionario(){
        nome = "";
        salario = 0;
        cpf = "";
    }

    public Funcionario(String nome, float salario, String cpf){
        this.nome = nome;
        this.salario = salario;
        this.cpf = cpf;
    }

    // metodos gets e set
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public float getSalario(){
        return salario;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    //Metodos da logica do negocio
    public void apresentar(){
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
        System.out.println("Cpf: " + cpf);
    }
}
