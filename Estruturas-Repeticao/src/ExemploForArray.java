public class ExemploForArray {
    public static void main(String[] args) {

        String alunos [] = {"ANA", "BRUNO","CARLA", "DANIEL", "ELISA", "FABIO","GABRIELA", "HENRIQUE","ISABELA", "JOAO"};

        //metodo de leitura por incrementação manual
        for(int i=0 ; i < alunos.length ; i++){
            System.out.println("O nome do aluno com o id "+i+" é "+ alunos[i]);
        }

        //Metodo reduzido
        for(String aluno : alunos){
            System.out.println("Nome do aluno é " + aluno );
        }

    }


}
