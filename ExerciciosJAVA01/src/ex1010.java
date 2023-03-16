import java.io.IOException;
import java.util.Scanner;

public class ex1010 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int cod_peca1 = sc.nextInt();
        int qnt_peca1 = sc.nextInt();
        double valor_peca1 = sc.nextDouble();


        int cod_peca2 = sc.nextInt();
        int qnt_peca2 = sc.nextInt();
        double valor_peca2 = sc.nextDouble();

        double preco_final;

        preco_final = (valor_peca1 * qnt_peca1)+(valor_peca2 * qnt_peca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n",preco_final);

    }
}
