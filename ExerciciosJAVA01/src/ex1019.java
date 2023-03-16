import java.io.IOException;
import java.util.*;
public class ex1019 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int hora = num/3600;
        int min = (num%3600)/60;
        int seg = (num%60)%60;

        System.out.println(hora+":"+min+":"+seg);
    }
}
