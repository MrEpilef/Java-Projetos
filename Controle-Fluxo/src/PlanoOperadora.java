public class PlanoOperadora {
    public static void main(String[] args) {
        String plano="B";            //B, M, T
        switch (plano){
            case "T":{
                System.out.println("5GB Youtube");
            }
            case "M":{
                System.out.println("-> WhatsApp e Instagram grátis");
            }
            case "B":{
                System.out.println("-> 100 minutos de ligação");
                break;
            }
            default:
                System.out.println("PLano indefinido ou inexistente");




        }




    }
}
