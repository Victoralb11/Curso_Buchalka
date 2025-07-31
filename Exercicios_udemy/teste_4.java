package teste_1;

import java.util.Scanner;

public class teste_4 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor para X: ");
        int x = sc.nextInt();
        System.out.println("Digite um valor para Y: ");
        int y = sc.nextInt();

        int soma = x+y;
        int subtracao = x-y;
        int multiplicacao = x*y;
        int divisao = x/y;

        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Multiplicacao: " + multiplicacao);
        System.out.println("Divisao: " + divisao);
    }
}
