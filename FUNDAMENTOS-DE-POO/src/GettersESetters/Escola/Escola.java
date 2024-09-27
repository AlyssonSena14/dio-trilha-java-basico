package GettersESetters.Escola;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();

        felipe.setNome("felipe");
        felipe.setIdade(12);

        System.out.println("O aluno " + felipe.getNome() + " Tem " + felipe.getIdade() + " anos");


    }



}

