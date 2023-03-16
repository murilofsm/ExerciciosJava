import java.util.Scanner;
public class ex04String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palavra1 = scanner.nextLine();
        String palavra2 = scanner.nextLine();

        char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'x', 'w', 'y', 'z'};
        int contP1 = 0;
        int contP2 = 0;
        int posicaoLetra = 0;

        boolean palavrasIguais = false;
        if (palavra1.equalsIgnoreCase(palavra2)) {
            palavrasIguais = true;

        }else{
            for (int i = 0; i < 26; i++) {
                if (alfabeto[i] == palavra1.toLowerCase().charAt(posicaoLetra)) {
                    contP1 = i + 1;
                }
                if (alfabeto[i] == palavra2.toLowerCase().charAt(posicaoLetra)) {
                    contP2 = i + 1;
                }
                if (palavra1.charAt(posicaoLetra) == palavra2.charAt(posicaoLetra)) {
                    posicaoLetra++;
                    contP1 = 0;
                    contP2 = 0;
                }
            }
        }

        if (contP1 < contP2) {
            System.out.println("A primeira palavra vem primeiro no alfabeto");
        } else if (contP2 < contP1) {
            System.out.println("A segunda palavra vem primeiro no alfabeto");
        } else if (palavrasIguais) {
            System.out.println("As palavras são iguais");
        }
    }
}
