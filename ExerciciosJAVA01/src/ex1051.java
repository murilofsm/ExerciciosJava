import java.util.*;
public class ex1051 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double renda = scanner.nextDouble();

        double imposto = 0;

        if(renda >=0 && renda < 2000){
            System.out.println("Isento");
        }else if(renda > 2000 && renda <= 3000){
            imposto = (renda-2000)*0.08;
            System.out.printf("R$ %.2f\n",imposto);


        }else if(renda > 3000 && renda <= 4500){
            imposto = (renda-3000)*0.18 + 80;
            System.out.printf("R$ %.2f\n",imposto);

        }else if(renda > 4500){
            imposto =  (renda-4500)*0.28 + 350;
            System.out.printf("R$ %.2f\n",imposto);
        }


    }
}
