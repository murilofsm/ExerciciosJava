import java.lang.*;
import java.util.Locale;
import java.util.Scanner;
public class ex02String {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);


        String texto = scanner.nextLine();

        int tamanhoTexto = texto.length();
        int contMaiusc=0;
        int contMinusc=0;

        String[] array = texto.split("");

        for (int i=0; i<tamanhoTexto; i++){
            if(array[i].equals(array[i].toUpperCase())){
                contMaiusc++;
            }else if(array[i].equals(array[i].toLowerCase())){
                contMinusc++;
            }
        }

        System.out.printf("O texto tem:\n %d letras Maiusculas \n %d letras Minusculas\n",contMaiusc,contMinusc);
    }
}
