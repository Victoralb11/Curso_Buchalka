package teste_1;

import java.util.Scanner;

public class sumDigits {

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        int resultado = sumDigits(num);
        if (resultado == -1) {
            System.out.println("Número inválido. Digite um número maior que zero.");
        } else {
            System.out.println("Soma dos dígitos: " + resultado);
        }
    }
    public static int sumDigits(int num) {
        if (num < 1) {
            return -1;
        } else {
            int soma = 0;
            while (num > 0) {
                int digito = num % 10;
                soma += digito;
                num = num / 10;
            }
            return soma;
        }
    }
}
