package teste_1;
import java.util.Scanner;
public class desafioSum {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Digite um numero limite: ");
        int num = sc.nextInt();
        System.out.println("Digite um numero para ser o primeiro divisor: ");
        int num2 = sc.nextInt();
        System.out.println("Digite um numero para ser o segundo divisor: ");
        int num3 = sc.nextInt();
        System.out.println("Digite um numero para ser o limite de numeros somados: ");
        int num4 = sc.nextInt();
        if (num4 > num){
            System.out.print("numero invalido");
        }
        int soma = 0;
        int contador = 0;
        for (int i = 1; i <= num; i++){
            if (by3and5(i,num2,num3)) {
                System.out.println(i + " ");
                soma += i;
                contador++;
            }
            if (contador == num4){
                break;
            }

        }
        System.out.println("a soma de todos esses numeros é: "+soma);
    }
    public static boolean by3and5(int i, int num2 , int num3) {
        if ((i % num2 ==0) && (i % num3 ==0) ){
            return true;
        }
        return false;
    }
}
