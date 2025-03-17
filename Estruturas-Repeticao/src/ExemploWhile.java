import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50;

        while (mesada>0){
            double valorDoce = valorAleatorio();
            if (valorDoce>mesada)
                valorDoce=mesada;
            System.out.println("Doce de valor : R$" + valorDoce + " adicionado ao carrinho");
            mesada=mesada-valorDoce;
            System.out.println("Agora eu tenho : R$ " + mesada);

        }
        System.out.println("O dinheiro de Joaozinho Acabou");
    }
    public static double valorAleatorio(){
        return java.util.concurrent.ThreadLocalRandom.current().nextDouble(2,15);
    }


}
