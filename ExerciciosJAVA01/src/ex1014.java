import java.io.IOException;
import java.util.Scanner;
public class ex1014 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        double X = scanner.nextDouble();
        double Y = scanner.nextDouble();
        double consumo = X/Y;

        System.out.printf("%.3f km/l\n", consumo);
    }
}
