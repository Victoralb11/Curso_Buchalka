package teste_1;

import java.util.Scanner;

public class teste_3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a largura do retangulo: ");
        int largura = sc.nextInt();
        System.out.println("Digite a altura do retangulo: ");
        int altura = sc.nextInt();

        int area = largura * altura ;
        System.out.println("Area do retangulo: " + area);
        int perimetro =  2*(largura + altura) ;
        System.out.println("Perimetro: " + perimetro);


    }
}
