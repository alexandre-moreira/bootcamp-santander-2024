package br.com.junglesoft.collections_java_api.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adcionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adcionarPessoa("Nome 1", 20, 1.56);
        ordenacaoPessoas.adcionarPessoa("Nome 2", 30, 1.80);
        ordenacaoPessoas.adcionarPessoa("Nome 3", 25, 1.70);
        ordenacaoPessoas.adcionarPessoa("Nome 4", 17, 1.56);

        System.out.println("Ordenar pessoas por idade: ");
        System.out.println(ordenacaoPessoas.ordenarPorIdade());

        System.out.println("\nOrdenar pessoas por idade: ");
        System.out.println(ordenacaoPessoas.ordenarPorIdade());

    }
}
