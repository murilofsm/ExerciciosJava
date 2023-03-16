import java.util.Scanner;
public class ex03String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String texto = scanner.nextLine();

        int tamanhoTexto = texto.length();

        String[] array = texto.split("");

        for (int i=0; i<tamanhoTexto; i++){
            if(array[i].equals(array[i].toUpperCase())){
                array[i] = array[i].toLowerCase();
            }else if(array[i].equals(array[i].toLowerCase())){
                array[i] = array[i].toUpperCase();
            }
        }
        texto = String.join("",array);

        System.out.println(texto);

    }
}
