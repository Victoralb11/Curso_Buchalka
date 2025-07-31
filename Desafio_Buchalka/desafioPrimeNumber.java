package teste_1;
import java.util.Scanner;
public class desafioPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero pra o range: ");
        int range = sc.nextInt();
        int contador = 0;

        for (int i = 2; i <= range; i++) {
            if (ePrime(i)) {
                System.out.print(i + " ");
                contador++;
            }
            if (contador >= 3) {
                System.out.println("tem três ou mais primos");
                break;
            }
        }

        System.out.println("Quantidade de números primos até " + range + ": " + contador);
    }


    public static boolean ePrime(int range) {
        if (range <= 1) {
            return false;
        }
        for (int i = 2; i < range; i++) {
            if (range % i == 0) {
                return false;
            }
        }
        return true;
    }

}