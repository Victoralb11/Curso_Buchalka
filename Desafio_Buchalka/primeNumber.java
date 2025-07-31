package teste_1;
import java.util.Scanner;
public class primeNumber {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite até que numero gostaria de saber os primos: ");
        int num = sc.nextInt();
        System.out.println("Números primos até " + num + ":");
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }

        }
    }
    public static boolean isPrime(int num){
        if (num <=1){
            return false;
        }
        for (int c = 2; c < num; c++){
            if (num % c == 0){
                return false;
            }
        }
        return true;
    }
}
