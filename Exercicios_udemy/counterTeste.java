package teste_1;
import java.util.Scanner;
public class counterTeste {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor até onde quer contar: ");
        int x = sc.nextInt();

        for (int c = 0; c<(x+1); c++){
            System.out.println(c);
        }
    }
}
