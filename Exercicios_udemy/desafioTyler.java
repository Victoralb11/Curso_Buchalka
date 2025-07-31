package teste_1;
import java.util.Scanner;
public class desafioTyler {
    public static double calcularMedia(double nota1, double peso1, double nota2, double peso2, double nota3, double peso3) {
        return (((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3));
    }

    public static void classificarNota(double media) {
        if (media <= 5) {
            System.out.println("Reprovado");
        } else if (media > 5 && media <= 6.9) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Aprovado");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite o peso da primeira nota: ");
        double peso1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite o peso da segunda nota: ");
        double peso2 = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();
        System.out.println("Digite o peso da terceira nota: ");
        double peso3 = sc.nextDouble();
        double media = calcularMedia(nota1, peso1, nota2, peso2, nota3, peso3);
        System.out.println(media);
        classificarNota(media);
    }
}