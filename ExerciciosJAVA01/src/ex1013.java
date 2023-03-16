import java.io.IOException;
import java.util.Scanner;

import static java.lang.Math.abs;

public class ex1013 {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int maiorAB = (a+b+abs(a-b))/2;

        if(maiorAB > c){
            System.out.printf("%d eh o maior\n", maiorAB);
        }else{
            System.out.printf("%d eh o maior\n", c);
        }
    }
}
