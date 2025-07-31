package teste_1;
import java.util.Scanner;
public class desafioTyler2 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Até qual valor deseja saber os pares?: ");
        int x = sc.nextInt();

        for (int i = 1; i <= x; i ++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }

    }
}
