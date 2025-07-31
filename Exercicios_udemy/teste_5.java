package teste_1;

import java.util.Scanner;

public class teste_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um substantivo: ");
        String sub = sc.nextLine();
        System.out.println("Digite um adjetivo: ");
        String adj = sc.nextLine();
        System.out.println("Digite um genero O/A: ");
        String gen = sc.nextLine();
        System.out.println("Digite uma parte do corpo: ");
        String parte = sc.nextLine();
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        System.out.println( gen +" "+ adj +" " +sub+ " tem"+ " "+ num + " "+ parte );

    }
}
