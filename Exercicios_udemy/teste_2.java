package teste_1;
import java.util.Scanner;
public class teste_2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite a temperatura em Celsius: ");
        double temperatura = sc.nextDouble();

        double fahrenheit = (temperatura * (9/5)) + 32;

        System.out.println("A temperatura em fahrenheit e: " + fahrenheit);

    }
}
