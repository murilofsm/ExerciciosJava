import java.util.Scanner;
public class ex2760 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String frase1 = scanner.nextLine();
        String frase2 = scanner.nextLine();
        String frase3 = scanner.nextLine();
        
        System.out.println(frase1+frase2+frase3);
        System.out.println(frase2+frase3+frase1);
        System.out.println(frase3+frase1+frase2);
        System.out.println(frase1+frase2+frase3);


    }
}
