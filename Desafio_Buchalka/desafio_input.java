package Desafio_Input;

import java.util.Scanner;

public class desafio_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 1;
        int soma = 0;
        while (contador <= 5) {
            System.out.println("Digite o" + contador + "º numero: ");
            try {
                int num = sc.nextInt();
                soma += num;
                contador++;
            } catch (Exception e) {
                System.out.println("Invalid Value");
                sc.nextLine();
            }
        }
        System.out.println(soma);
        sc.close();
    }
}