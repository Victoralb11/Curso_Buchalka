package teste_1;

import java.util.Scanner;

public class hello_world {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Digite o seu numero favorito: ");
        int numeroFavorito = sc.nextInt();
        System.out.println("Digite o seu numero decimal favorito: ");
        double numeroDecimal = sc.nextDouble();

        int Resposta1 = idade + numeroFavorito;
        int Resposta2 = idade * numeroFavorito;
        int Resposta3 = numeroFavorito * numeroFavorito;
        double Resposta4 = numeroDecimal / 2 ;

        System.out.println("Hello" + nome + "you're " + idade + "years old, your answer is: " + Resposta1 +", " + Resposta2 + "," + Resposta3 +", " + Resposta4 + ".");
    }
}

