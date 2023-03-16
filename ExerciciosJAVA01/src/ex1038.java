import java.io.IOException;
import java.util.Scanner;
public class ex1038 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int pedido1 = scanner.nextInt();
        int qnt_pedido = scanner.nextInt();

        float somapedido = 0;

        if(pedido1 == 1){
            somapedido += 4.00;
        }else if(pedido1 == 2){
            somapedido += 4.50;
        }else if(pedido1 == 3){
            somapedido += 5.00;
        }else if(pedido1 == 4){
            somapedido += 2.00;
        }else if(pedido1 == 5){
            somapedido += 1.50;
        }

        somapedido = somapedido * qnt_pedido;

        System.out.printf("Total: R$ %.2f\n", somapedido);
    }
}
