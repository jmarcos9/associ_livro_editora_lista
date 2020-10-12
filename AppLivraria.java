package segundoPeriodo.editoraAssociacaoLista;

public class AppLivraria {

    public static void main(String[] args) {

        Editora editora = new Editora("Saber Infotech");

        Autor autor = new Autor( "Aldo Santos", "aldosantos@gmail.com");
        Livro.adicionarlista(autor);
        autor = new Autor("Also Souza","aldosouza@gmail.com");
        Livro.adicionarlista(autor);
        autor = new Autor("Aldo Silva", "aldosilva@gmail.com");
        Livro.adicionarlista(autor);

        Livro livro = new Livro(1, "Java com Aldo", "ASBJ125",editora);

        System.out.println(livro);
    }
}
