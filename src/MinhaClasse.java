public class MinhaClasse{

public static void main(String [] args){
    System.out.println("Olá turma, sejam bem vindos");
    String primeiroNome = "Felipe";
    String segundoNome = "Alvez";
    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    System.out.println(nomeCompleto);
}
public static String nomeCompleto (String primerioNome, String segundoNome) {
    return primerioNome.concat(" ").concat(segundoNome);

}
}