import java.util.Locale;
import java.util.Scanner;

/**<H1>Programa SmartTv</H1>
*   O programa SmartTv permite operar uma tv por comandos, com operações simples de Ligar/Desligar,
*   aumentar ou diminuir o volumel e canal, ou trocar de canal diretamente.
*
* <b>Projeto SmartTv</b>
*@autor     Felipe
* @version  1.0
* @since    11/03/2025
*/



public class Usuario {


    public static void main(String [] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> Tv ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Aumentei o volume para: " + smartTv.volume);

        System.out.println("Qual canal o(a) senhor(a) escolhe?");
        SmartTv.novoCanal = scanner.nextInt();
        smartTv.trocarCanal(SmartTv.novoCanal);

        System.out.println("Troquei o canal da tv para o: " + smartTv.canal);
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Coloquei no canal "+ smartTv.canal + " agora");

        smartTv.diminuirVolume();
        System.out.println("Diminui o volume para: " + smartTv.volume);

        smartTv.desligar();
        System.out.println("Acho que vou dormir...");
        System.out.println(smartTv.ligada);

    }

}