import java.util.Scanner;
public class ex1099 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X, Y, soma;
        int N = scanner.nextInt();

        for(int i=0; i<N; i++){
            soma=0;
            X = scanner.nextInt();
            Y = scanner.nextInt();

            if(X>Y){
                for(int j=Y+1; j<X; j++){
                    if(j%2!=0){
                        soma += j;
                    }
                }

            }else if(Y>X){
                for(int j=X+1; j<Y; j++){
                    if(j%2!=0){
                        soma += j;
                    }
                }
            }
            System.out.println(soma);
        }
    }
}
