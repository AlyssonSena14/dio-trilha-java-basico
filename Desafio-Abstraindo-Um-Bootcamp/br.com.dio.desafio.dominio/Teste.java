import java.time.LocalDate;

public class Teste {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Spring boot");
        curso1.setDescricao("Curso sobre java com spring boot");
        curso1.setCargaHoraria(4);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java");
        curso2.setDescricao("Curso sobre java basico");
        curso2.setCargaHoraria(8);
        Conteudo conteudo = new Curso();

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Dev de Sucesso com Java");
        mentoria1.setDescricao("mentoria com nelio alves sobre Java Poo");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devalysson = new Dev();
        devalysson.setNome("Alysson");
        devalysson.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Alysson" + devalysson.getConteudosInscritos());
        devalysson.progredir();
        devalysson.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Alysson" + devalysson.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Alysson" + devalysson.getConteudosConcluidos());
        System.out.println("XP:" + devalysson.calcularTotalXp());

        System.out.println("--------");

        Dev devLorena = new Dev();
        devLorena.setNome("Lorena");
        devLorena.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Lorena" + devLorena.getConteudosInscritos());
        devLorena.progredir();
        devLorena.progredir();
        devLorena.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Lorena" + devLorena.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Lorena" + devLorena.getConteudosConcluidos());
        System.out.println("XP:" + devLorena.calcularTotalXp());





    }




}
