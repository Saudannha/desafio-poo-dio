import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("descrição curso Js");
        curso2.setCargaHoraria(4);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

   /*     System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAnderson = new Dev();
        devAnderson.setNome("Anderson");
        devAnderson.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Anderson " + devAnderson.getConteudosInscritos());
        devAnderson.progredir();
        devAnderson.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Anderson " + devAnderson.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Anderson " + devAnderson.getConteudosConcluidos());
        System.out.println("XP: " + devAnderson.calcularTotalXp());

        System.out.println("------------");

        Dev devMiguel = new Dev();
        devMiguel.setNome("Miguel");
        devMiguel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Miguel " + devMiguel.getConteudosInscritos());
        devMiguel.progredir();
        devMiguel.progredir();
        devMiguel.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Miguel " + devMiguel.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Miguel " + devMiguel.getConteudosConcluidos());
        System.out.println("XP: " + devMiguel.calcularTotalXp());





    }
}
