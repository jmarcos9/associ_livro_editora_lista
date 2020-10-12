package segundoPeriodo.editoraAssociacaoLista;

public class Autor {

    static private int identificador;

    private int id;
    private String nome;
    private String email;

    public Autor(String nome, String email) {
        this.id = gerarIdenificador();
        this.nome = nome;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private int gerarIdenificador(){
        return  ++identificador;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
