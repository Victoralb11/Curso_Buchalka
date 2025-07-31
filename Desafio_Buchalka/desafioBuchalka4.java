package teste_1;
import java.util.Scanner;
public class desafioBuchalka4 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite uma letra: ");
        char letra = sc.next().charAt(0);
        char letraMinuscula = Character.toLowerCase(letra);

        switch (letraMinuscula){
            case 'a':
                System.out.println(letraMinuscula + " é Able");
                break;
            case 'b':
                System.out.println(letraMinuscula + " é Baker");
                break;
            case 'c':
                System.out.println(letraMinuscula + " é Charlie");
                break;
            case 'd':
                System.out.println(letraMinuscula + " é Dog");
                break;
            case 'e':
                System.out.println(letraMinuscula + " é Easy");
                break;
            default:
                System.out.println("Erro: "+ letraMinuscula +" não encontrada na lista");
                break;
        }
    }

}
