import java.io.IOException;
import java.util.Scanner;
public class ex1043 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();

        if(c < a + b && b < a + c && a < b + c){
            float perimetro = a+b+c;
            System.out.printf("Perimetro = %.1f\n", perimetro);
        }else{
            float area = ((a+b)*c)/2;
            System.out.printf("Area = %.1f\n",area);
        }
    }
}
