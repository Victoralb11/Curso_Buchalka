package Desafio_Max_Min;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int min = 0;
        boolean primeiroValor = false;

        do {
            System.out.println("Digite um valor inteiro ou qualquer outra coisa para sair ");
            if (sc.hasNextInt()) {
                int valor = sc.nextInt();
                if (!primeiroValor) {
                    max = valor;
                    min = valor;
                    primeiroValor = true;
                }
                else {
                    if (valor > max) {
                        max = valor;
                    }
                    if (valor < min) {
                        min = valor;
                    }
                }
                sc.nextLine();
            }else{
                break;
            }
        } while (true);
        if (primeiroValor) {
            System.out.println("Máximo: " + max);
            System.out.println("Mínimo: " + min);
        }else{
            System.out.println("Nenhum valor valido");
        }

        sc.close();
}
}



