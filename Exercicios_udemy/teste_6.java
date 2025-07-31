package teste_1;

import java.util.Scanner;

public class teste_6 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double nota = sc.nextDouble();
        System.out.println("Digite o peso da primeira nota: ");
        double peso = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double seg = sc.nextDouble();
        System.out.println("Digite o peso da segunda nota: ");
        double peso2 = sc.nextDouble();


        double media = ((nota * peso) + (seg * peso2)) / (peso + peso2);
        double diferenca = nota - seg;
        double resto = nota % seg; // ou (int)nota % (int)seg

        System.out.println("Media: " + media + " Diferenca: " + diferenca + ", Resto: " + resto);
    }
}
