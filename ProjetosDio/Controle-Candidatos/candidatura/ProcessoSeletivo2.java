package candidatura;


import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo2 {
    public static void main(String[] args) {
       selecaoCandidatos();
    }


    static void selecaoCandidatos() {
        String[] candidatos =
                {
                "ANA", "PAULO", "LUCAS", "MARIA", "PEDRO",
                "JULIA", "ROBERTO", "SOFIA", "GABRIEL", "LAURA",
                "FELIPE", "BEATRIZ", "MATEUS", "ISABELA", "RICARDO",
                "CAMILA", "LEONARDO", "ALICE", "RAFAEL", "MANUELA",
                "EDUARDO", "HELENA", "VINICIUS", "VALENTINA", "GUILHERME"
                };

        int candidatoSelecionado = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.00;

        while (candidatoSelecionado < 5) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.printf("O candidato %s solicitou este valor de salário: %.2f \n", candidato, salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga!");
                candidatoSelecionado++;
            } else {
                System.out.println("O candidato " + candidato + " não foi selecionado para a vaga");
            }
            candidatoAtual++;
        }

    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.00, 2200.00);

    }
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.00;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para candidato!");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta!");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS!");
        }

    }

}

