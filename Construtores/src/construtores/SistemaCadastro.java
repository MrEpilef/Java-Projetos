package src.construtores;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("123", "Felipe");
        System.out.println("CPF: " + marcos.getNome()+ "\nNome: " + marcos.getCpf());
    }
}
