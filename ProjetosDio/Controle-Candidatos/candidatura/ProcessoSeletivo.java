package candidatura;

import java.util.Random;

public class ProcessoSeletivo {

    static void main(String[] args) {
        String[] candidatos = {"ANA", "PAULO", "LUCAS", "MARIA", "PEDRO", "JULIA", "ROBERTO", "SOFIA", "GABRIEL"};
        for (String candidato : candidatos) {
            EntrandoEmContato(candidato);
        }

    }

    //Função que recebe paramentro "candidato", tentara entrar em contato com candidato 3 vezes
    static void EntrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        //Laço de repetição para fazer tentativa de contato
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso para o candidato " + candidato);
            }

        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " na tentativa " + tentativasRealizadas);
        } else
            System.out.println("Nao conseguimos contato com " + candidato);
    }

    //Função que gera um número aleatório, que se igual a 1, retornara true
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }


}