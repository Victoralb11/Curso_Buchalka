package teste_1;

import java.util.Scanner;

public class testeMétodos {
    public static double calcularIMC(double peso, double altura){
        return peso / (altura * altura);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua altura em metros: ");
        double altura = sc.nextDouble();
        System.out.println("Digite o seu peso em kg: ");
        double peso = sc.nextDouble();
        double imc = calcularIMC(peso, altura);
        System.out.println(imc);
        if (imc < 18.5){
            System.out.println("Abaixo do peso");
        }else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso saudável");
        }else if (imc > 24.9 && imc <= 29.9) {
            System.out.println("Sobrepeso");
        }else if (imc > 30 && imc < 39.9) {
            System.out.println("Obesidade");
        }
    }

}
