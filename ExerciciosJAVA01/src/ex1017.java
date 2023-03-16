import java.io.IOException;
import java.util.*;
public class ex1017 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        double horas = scanner.nextInt();
        double km = scanner.nextInt();

        double qnt_litros = (horas * km)/12;

        System.out.printf("%.3f\n", qnt_litros);
    }
}
