import java.time.LocalDate;

public class Teste {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Spring boot");
        curso1.setDescricao("Curso sobre java com spring boot");
        curso1.setCargaHoraria(48);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java");
        curso2.setDescricao("Curso sobre java basico");
        curso2.setCargaHoraria(24);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Dev de Sucesso com Java");
        mentoria1.setDescricao("mentoria com nelio alves sobre Java Poo");
        mentoria1.setData(LocalDate.now());





        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);

    }




}
