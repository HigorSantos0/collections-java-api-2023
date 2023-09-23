package List.Pesquisa;

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
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro l : livroList){
                if(l.getAnoPublicado() >= anoInicial && l.getAnoPublicado() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    //No caso desse exercicio ele quer que retorne apenas a primeira occorrencia encontrada
    //Não tendo necessidade de pegar uma lista inteira

    public Livro pesquisaPorTitulo(String titulo){
        Livro livroPorTitulo = null;

        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }

        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {

        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 1934);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 1998);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 1", 1900);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(1900, 2000));
        System.out.println(catalogoLivros.pesquisaPorTitulo("Livro 3"));



    }

}
