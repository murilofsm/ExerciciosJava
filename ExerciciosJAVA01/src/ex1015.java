import java.io.IOException;
import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class ex1015 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distancia;

        distancia = sqrt(pow((x2 - x1),2) + pow((y2 - y1),2));

        System.out.printf("%.4f\n", distancia);

    }
}
