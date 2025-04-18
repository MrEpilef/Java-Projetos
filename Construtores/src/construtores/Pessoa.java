package src.construtores;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    public Pessoa (String cpf, String nome) {
        this.nome = nome;
        this.cpf = cpf;
    }
    public Pessoa () {

    }
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
