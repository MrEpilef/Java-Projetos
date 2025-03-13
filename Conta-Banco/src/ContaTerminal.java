/**<H1>Conta Terminal</H1>
 * Este algoritmo faz a leitura da entrada de dados bancarios do cliente e posteriormente
 * imprime-os na tela
 *
 * @creator Felipe
 * @since   13/03/2025
 */


//importando a classe Scanner e Locale
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal{
    public static void main (String [] args) throws Exception{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); //Criação de um novo scanner;

        int numeroConta;
        String agencia, nomeCliente;
        double saldoCliente;

        //Solicita o nome do cliente e grava na variável nomeCliente
        System.out.println("Caro cliente, por obséquio, digite seu nome!");
        System.out.print("-> ");
        nomeCliente = scanner.next() ;

        //Solicita o nome o númeor da conta do cliente e grava na variável numeroConta
        System.out.println("Por gentileza,"+nomeCliente+", digite o número da sua conta!");
        System.out.print("-> ");
        numeroConta = scanner.nextInt() ;

        //Solicita o número da agência e grava na variável agencia
        System.out.println("Digite o Número de sua agência");
        System.out.print("-> ");
        agencia = scanner.next() ;

        //Solicita o saldo do cliente e grava na variável saldoCliente
        System.out.println("Digite o saldo em conta");
        System.out.print("-> ");
        saldoCliente = scanner.nextDouble();

        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldoCliente + " já está disponível para saque");
    }

}