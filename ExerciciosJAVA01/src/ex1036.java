import java.io.IOException;
import java.util.*;

import static java.lang.Math.*;

public class ex1036 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double delta = sqrt(pow(b,2) - 4*a*c);

        double x1 = (-(b)+delta)/(2*a);
        double x2 = (-(b)-delta)/(2*a);

        if(delta > 0 && a != 0){
            System.out.printf("R1 = %.5f\n",x1);
            System.out.printf("R2 = %.5f\n",x2);
        }else{
            System.out.println("Impossivel calcular");
        }
    }
}
