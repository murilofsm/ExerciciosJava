import java.io.IOException;
import java.util.Scanner;
public class ex1048 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextDouble();

        double reajuste=0;
        int percentual=0;

        if(salario >= 0 && salario <= 400){
            reajuste = salario * 0.15;
            percentual = 15;
        }else if(salario >= 400.01 && salario <= 800){
            reajuste = salario * 0.12;
            percentual = 12;
        }else if(salario >= 800.01 && salario <= 1200){
            reajuste = salario * 0.10;
            percentual = 10;
        }else if(salario >= 1200.01 && salario <= 2000){
            reajuste = salario * 0.07;
            percentual = 7;
        }else if(salario > 2000){
            reajuste = salario * 0.04;
            percentual = 4;
        }
        salario = salario + reajuste;

        System.out.printf("Novo salario: %.2f\n", salario);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.println("Em percentual: "+percentual+" %");

    }
}
