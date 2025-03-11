public class MeuProjeto{

public static void main(String [] args){
    System.out.print("Seja Bem vindo, ");
    String primeiroNome = "Felipe";
    String segundoNome = "Miguel";
    String terceiroNome = "Pereira";
    String quartoNome = "Marques";
    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome, terceiroNome, quartoNome);
    System.out.println(nomeCompleto);
}
public static String nomeCompleto (String primerioNome, String segundoNome, String terceiroNome, String quartoNome) {
    return primerioNome.concat(" ").concat(segundoNome).concat(" ").concat(terceiroNome).concat(" ").concat(quartoNome);

}
}