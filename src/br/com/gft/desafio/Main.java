package br.com.gft.desafio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Criando cursos
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Aprenda Java do zero.");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Spring Boot");
        curso2.setDescricao("Desenvolvendo com Spring.");
        curso2.setCargaHoraria(6);

        // Criando mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Tirando dúvidas ao vivo.");
        mentoria.setData(LocalDate.now());

        // Criando Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp GFT Java");
        bootcamp.setDescricao("Treinamento para estágio Java na GFT");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        // Criando Dev Lucas
        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Lucas: " + devLucas.getConteudosInscritos());
        devLucas.progredir();
        devLucas.progredir();
        System.out.println("Conteúdos concluídos de Lucas: " + devLucas.getConteudosConcluidos());
        System.out.println("XP de Lucas: " + devLucas.calcularTotalXp());

        // Criando Dev Ester
        Dev devEster = new Dev();
        devEster.setNome("Ester");
        devEster.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Ester: " + devEster.getConteudosInscritos());
        devEster.progredir();
        System.out.println("Conteúdos concluídos de Ester: " + devEster.getConteudosConcluidos());
        System.out.println("XP de Ester: " + devEster.calcularTotalXp());
    }
}

