package teste_1;

public class miniDesafioBuchalka {
    public static void main (String[] args) {
        for (double rate = 7.5; rate <= 10.0; rate += 0.25) {
            double interest = calculateInte(100.00, rate);
            System.out.println("$100.00 com "+rate+ "% de interesse é = "+interest);
        }
    }
    public static double calculateInte(double amout, double interestRate){
            return (amout * (interestRate/100));
        }
    }

