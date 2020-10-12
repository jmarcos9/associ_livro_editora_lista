package segundoPeriodo.editoraAssociacaoLista;

import java.util.ArrayList;
import java.util.Arrays;

public class Livro {

    private static ArrayList<Autor> listaAutor = new ArrayList<>();

    private int codigo;
    private String titulo;
    private String isbn;
    private Editora editora;

    public Livro() {}

    public Livro(int codigo, String titulo, String isbn, Editora editora) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.isbn = isbn;
        this.editora = editora;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public static ArrayList<Autor> getListaAutor() {
        return listaAutor;
    }

    public static void setListaAutor(ArrayList<Autor> listaAutor) {
        Livro.listaAutor = listaAutor;
    }

    static public void adicionarlista(Autor autores){
        listaAutor.add(autores);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", isbn='" + isbn + '\'' +
                ", editora=" + editora +
                ", \nAutores=" + listaAutor +
                '}';
    }


}
