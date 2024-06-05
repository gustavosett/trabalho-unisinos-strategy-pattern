

public class Usuario {
    private int codigo;
    private String nome;
    private Endereco endereco;

    public Usuario() {
    }

    public Usuario(int codigo, String nome, Endereco endereco) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
    }

    // Getters e Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
