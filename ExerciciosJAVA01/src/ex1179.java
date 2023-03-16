import java.util.*;
import java.io.IOException;


public class ex1179 {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);

        int[] par = new int[5];
        int[] impar = new int[5];
        int num;

        int contPar = 0;
        int contImpar = 0;
        int i;

        for(i = 0; i < 15; i++){
            num = scanner.nextInt();
            if(num%2==0){
                par[contPar] = num;
                contPar++;
                if(contPar == 5){
                    for(int j=0; j<5; j++){
                        System.out.printf("par[%d] = %d\n",j,par[j]);
                    }
                    contPar = 0;
                }
            }else if(num%2!= 0){
                impar[contImpar] = num;
                contImpar++;
                if(contImpar == 5){
                    for(int j=0; j<5; j++){
                        System.out.printf("impar[%d] = %d\n",j,impar[j]);
                    }
                    contImpar = 0;
                }
            }

        }
        for( i =0;i<contImpar; i++){
            System.out.printf("impar[%d] = %d\n",i,impar[i]);
        }
        for( i =0;i<contPar; i++){
            System.out.printf("par[%d] = %d\n",i,par[i]);
        }
    }
}
