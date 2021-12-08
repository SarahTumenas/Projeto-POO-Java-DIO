import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("Módulo I do curso Java");
        curso1.setCargaHoraria(10);


        Curso curso3 = new Curso();
        curso3.setTitulo("curso Java");
        curso3.setDescricao("Módulo II do curso Java");
        curso3.setCargaHoraria(12);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JavaScript");
        curso2.setDescricao("Módulo I do curso JS");
        curso2.setCargaHoraria(11);

        Curso curso4 = new Curso();
        curso4.setTitulo("curso JavaScript");
        curso4.setDescricao("Módulo II do curso JS");
        curso4.setCargaHoraria(8);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria curso Java");
        mentoria1.setDescricao("Primeiros conceitos de Java");
        mentoria1.setData(LocalDate.now());


        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria curso JavaScript");
        mentoria2.setDescricao("Primeiros conceitos de JS");
        mentoria2.setData(LocalDate.of(2021,12,20));

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Formação de Desenvolvedores Java - Básico");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso3);
        bootcamp1.getConteudos().add(mentoria1);



        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setNome("Bootcamp JavaScript Developer");
        bootcamp2.setDescricao("Formação de Desenvolvedores JS - Básico");
        bootcamp2.getConteudos().add(curso2);
        bootcamp2.getConteudos().add(curso4);
        bootcamp2.getConteudos().add(mentoria2);

        Dev dev1 = new Dev();
        dev1.setNome("Lucas");
        dev1.inscreverBootcamp(bootcamp1);
        dev1.inscreverBootcamp(bootcamp2);

        System.out.println(dev1.getNome() +"\nConteúdos inscritos \n" + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println("\t ********* \t");
        System.out.println("Conteúdos concluídos \n" + dev1.getConteudosConcluidos());
        System.out.println("\t ********* \t");
        System.out.println("XP \n" + dev1.calcularTotalXp());


        System.out.println("\t ----------------------------------------------------------------------- \t");

        Dev dev2 = new Dev();
        dev2.setNome("Marcia");
        dev2.inscreverBootcamp(bootcamp2);

        System.out.println(dev2.getNome() +"\nConteúdos inscritos \n" + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        System.out.println("\t ********* \t");
        System.out.println("Conteúdos concluídos \n" + dev2.getConteudosConcluidos());
        System.out.println("\t ********* \t");
        System.out.println("XP \n" + dev2.calcularTotalXp());

        System.out.println("\t ----------------------------------------------------------------------- \t");

        Dev dev3 = new Dev();
        dev3.setNome("Camila");
        dev3.inscreverBootcamp(bootcamp1);

        System.out.println(dev3.getNome() +"\nConteúdos inscritos \n" + dev3.getConteudosInscritos());
        dev3.progredir();
        System.out.println("\t ********* \t");
        System.out.println("Conteúdos concluídos \n" + dev3.getConteudosConcluidos());
        System.out.println("\t ********* \t");
        System.out.println("XP \n" + dev3.calcularTotalXp());

        System.out.println("\t ----------------------------------------------------------------------- \t");

        Dev dev4 = new Dev();
        dev4.setNome("Julio");
        dev4.inscreverBootcamp(bootcamp2);

        System.out.println(dev4.getNome() +"\nConteúdos inscritos \n" + dev4.getConteudosInscritos());
        dev4.progredir();
        System.out.println("\t ********* \t");
        System.out.println("Conteúdos concluídos \n" + dev4.getConteudosConcluidos());
        System.out.println("\t ********* \t");
        System.out.println("XP \n" + dev4.calcularTotalXp());

        System.out.println("\t ----------------------------------------------------------------------- \t");






    }
}
