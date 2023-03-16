import java.io.IOException;
import java.util.Scanner;
public class ex1008 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int horas_trab = sc.nextInt();
        float pag_hora = sc.nextFloat();

        float salario;

        salario = horas_trab * pag_hora;

        System.out.println("NUMBER = "+number);
        System.out.printf("SALARY = U$ %.2f\n", salario);
    }
}
