import java.util.*;
public class ex1074 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = scanner.nextInt();
        int n;

        for(int i=0; i<tamanho; i++){
            n = scanner.nextInt();

            if(n == 0){
                System.out.println("NULL");
            }else if(n%2 != 0){
                if(n > 0){
                    System.out.println("ODD POSITIVE");
                }else{
                    System.out.println("ODD NEGATIVE");
                }

            }else if(n%2 == 0){
                if(n > 0){
                    System.out.println("EVEN POSITIVE");
                }else{
                    System.out.println("EVEN NEGATIVE");
                }
            }
        }
    }
}
