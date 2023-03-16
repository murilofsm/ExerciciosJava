import java.util.Scanner;

public class testeString {
    private double PI = Math.PI;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a,b,c;
        String texto = "texto";
        String t2 = scanner.next();
        System.out.println(texto.charAt(2)); // ACHA A POSICAO DO CARACTERE
        System.out.println(texto.concat(t2)); //
        System.out.println(texto+ t2);
        System.out.println(texto.contains("e"));
        System.out.println(texto.endsWith("to"));
        System.out.println(texto.equalsIgnoreCase("TEXTO"));


    }
}
