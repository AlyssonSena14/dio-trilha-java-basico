package list.PesquisaList;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);

                }
            }
        }
        return livroList;

    }


    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinial){
        List<Livro> livrospPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinial){
                    livrospPorIntervaloAnos.add(l);
                }
            }
        }
        return livrospPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titutlo){
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty())
            for (Livro l : livroList){
                if (l.getTitulo().equalsIgnoreCase(titutlo));
                livroPorTitulo = l;
                break;
            }

        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1 ", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1 ", "Autor 2", 2020);
        catalogoLivros.adicionarLivro("Livro 2 ", "Autor 2", 2020);
        catalogoLivros.adicionarLivro("Livro 3 ", "Autor 3", 2020);
        catalogoLivros.adicionarLivro("Livro 4 ", "Autor 4", 2020);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 4"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2022));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 2 "));


    }

}
