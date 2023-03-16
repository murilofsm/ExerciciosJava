import java.util.Scanner;
public class ex1080 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vet = new int[100];

        int maiorNumero=0;
        int posicaoMaior=0;

        for(int i=0; i<100; i++){
            vet[i] = scanner.nextInt();
            if(vet[i]>maiorNumero){
                maiorNumero = vet[i];
                posicaoMaior = i+1;
            }
        }
        System.out.println(maiorNumero);
        System.out.println(posicaoMaior);
    }
}
