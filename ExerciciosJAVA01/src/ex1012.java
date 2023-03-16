import java.io.IOException;
import java.util.Scanner;

import static java.lang.Math.pow;

public class ex1012 {
    public static void main(String[] args) throws IOException{

        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double triangulo = (A * C)/2;
        double circulo = 3.14159 * pow(C,2);
        double trapezio = ((A + B) * C)/2;
        double quadrado = pow(B,2);
        double retangulo = A * B;

        System.out.printf("TRIANGULO: %.3f\n", triangulo);
        System.out.printf("CIRCULO: %.3f\n", circulo);
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        System.out.printf("RETANGULO: %.3f\n", retangulo);
    }
}
