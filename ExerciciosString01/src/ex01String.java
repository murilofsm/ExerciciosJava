import java.util.Scanner;
import java.lang.*;

public class ex01String {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = scanner.next();
        nome = nome.toUpperCase();

        System.out.println(new StringBuilder(nome).reverse());

    }
}
