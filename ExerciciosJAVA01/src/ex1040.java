import java.io.IOException;
import java.util.*;

public class ex1040 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        float n1 = scanner.nextFloat();
        float n2 = scanner.nextFloat();
        float n3 = scanner.nextFloat();
        float n4 = scanner.nextFloat();

        n1 *= 2;
        n2 *= 3;
        n3 *= 4;
        n4 *= 1;

        float media = (n1+n2+n3+n4)/10;

        if(media >= 7){
            //Aprovado
            System.out.printf("Media: %.1f\n",media);
            System.out.println("Aluno aprovado.");
        }else if(media < 5){
            //Reprovado
            System.out.printf("Media: %.1f\n",media);
            System.out.println("Aluno reprovado.");
        }else{
            //Exame
            System.out.printf("Media: %.1f\n",media);
            System.out.println("Aluno em Exame.");
            float nota_exame = scanner.nextFloat();
            System.out.printf("Nota do Exame: %.1f\n",nota_exame);

            float media_final = (media+nota_exame)/2;

            if(media_final >= 5){
                System.out.println("Aluno aprovado.");
            }else if(media_final < 5){
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n",media_final);
        }
    }
}
