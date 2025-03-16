public class CaixaEletronico {
    public static void main(String[] args) {

        double saldo = 1750.89;
        double valorSolicitado = 1563.97;

        if (valorSolicitado<saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Novo valor : " + saldo);
        }else
            System.out.println("Saldo insuficiente");

    }
    }
