import java.util.Locale;
import java.util.Scanner;

public class SalarioLiquido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double salarioBruto;
        double beneficios;
        double valorImpostos =0;

        System.out.println("Digite o valor de seu salário bruto");
        salarioBruto = scanner.nextDouble();
        beneficios = scanner.nextDouble();

        if(salarioBruto<=1100){
            valorImpostos=0.05*salarioBruto;
        }else if (salarioBruto>1100 && salarioBruto<2500){
            valorImpostos=0.1*salarioBruto;
        }else {
            valorImpostos=0.15*salarioBruto;
        }
        double salarioLiquido = (salarioBruto-valorImpostos)+beneficios;

        System.out.printf("Você ira receber líquidos R$%.2f", salarioLiquido);




    }
}
