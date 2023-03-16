import java.io.IOException;
import java.util.Scanner;
public class ex1016 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int km = scanner.nextInt();

        int tempo_necessario;
        tempo_necessario = km*2;

        System.out.printf("%d minutos\n",tempo_necessario);
    }
}
