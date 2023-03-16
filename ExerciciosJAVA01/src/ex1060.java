import java.io.IOException;
import java.util.*;
public class ex1060 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int[] num = new int[7];
        int cont = 0;

        for(int i = 0; i < 6; i++){
            num[i] = scanner.nextInt();
            if(num[i] != 0){
                if(num[i] >= 0){
                    cont++;
                }
            }
        }
        System.out.printf("%d valores positivos\n", cont);
    }
}
