import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(10);

        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JavaScript");
        curso2.setDescricao("Descrição do curso JS");
        curso2.setCargaHoraria(8);

        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria curso Java");
        mentoria1.setDescricao("Primeiros conceitos de Java");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria curso JavaScript");
        mentoria2.setDescricao("Primeiros conceitos de JS");
        mentoria2.setData(LocalDate.of(2021,12,20));

        System.out.println(mentoria2);




    }
}
