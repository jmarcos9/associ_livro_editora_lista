package segundoPeriodo.editoraAssociacaoLista;

public class Editora {

    private int codigo;
    private String razaoSocial;
    private String contato;
    private String telefone;

    public Editora(String razaoSocial) {
        this.razaoSocial = razaoSocial;

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "razaoSocial='" + razaoSocial + '\'' +
                '}';
    }
}
