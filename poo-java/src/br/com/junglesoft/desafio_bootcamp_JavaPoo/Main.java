package br.com.junglesoft.desafio_bootcamp_JavaPoo;

import br.com.junglesoft.desafio_bootcamp_JavaPoo.dominio.Bootcamp;
import br.com.junglesoft.desafio_bootcamp_JavaPoo.dominio.Curso;
import br.com.junglesoft.desafio_bootcamp_JavaPoo.dominio.Dev;
import br.com.junglesoft.desafio_bootcamp_JavaPoo.dominio.Mentoria;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java Básico");
        curso1.setDescricao("Curso básico de Java, aprenda os fundamentos");
        curso1.setCargaHoraria(64);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("Java POO");
        curso2.setDescricao("Aprenda o paradigma orientacao a obejtos");
        curso2.setCargaHoraria(120);

        Mentoria mentoria =  new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Dicas básicas de Java");
        mentoria.setData(LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAlex = new Dev();
        devAlex.setNome("Alex");
        devAlex.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos: " + devAlex.getConteudosInscritos());
        devAlex.progredir();
        System.out.println("-");
        System.out.println("Conteudo Inscritos Leo: " + devAlex.getConteudosConcluidos());
        System.out.println("Conteudo Inscritos Leo: " + devAlex.getConteudosConcluidos());
        System.out.println("XP: " + devAlex.calcularTotal());

        System.out.println("--------");

        Dev devLeo = new Dev();
        devLeo.setNome("Leo");
        devLeo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos: " + devLeo.getConteudosInscritos());
        devLeo.progredir();
        System.out.println("-");
        System.out.println("Conteudo Inscritos Leo: " + devLeo.getConteudosConcluidos());
        System.out.println("Conteudo Inscritos Leo: " + devLeo.getConteudosConcluidos());
        System.out.println("XP: " + devLeo.calcularTotal());
    }
    
}
