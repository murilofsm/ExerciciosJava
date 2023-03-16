import java.io.IOException;
import java.util.*;
public class ex1020 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int ano = num/365;
        int mes = (num%365)/30;
        int dia = (num%365)%30;
        System.out.println(ano+" ano(s)");
        System.out.println(mes+" mes(es)");
        System.out.println(dia+" dia(s)");
    }
}
