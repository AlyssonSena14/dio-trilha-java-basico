package Construtores;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("123","MARCOS");

        marcos.setEndereco("RUA DAS ALEGRIAS");

        System.out.println(marcos.getNome() + "-" + marcos.getCpf());

    }
}
