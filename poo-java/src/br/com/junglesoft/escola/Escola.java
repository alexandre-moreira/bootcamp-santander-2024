package br.com.junglesoft.escola;

public class Escola {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome="Felipe";
        aluno1.idade = 8;

        System.out.println("O aluno " + aluno1.nome + " tem " + aluno1.idade + " anos.");

    }
}
