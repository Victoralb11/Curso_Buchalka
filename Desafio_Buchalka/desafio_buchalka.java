package teste_1;

public class desafio_buchalka {
    public static void main (String[] args){
        double x = 20.00;
        double y = 80.00;

        double soma = (x+y) * 100.00;
        double resto = soma % 40.00;

        boolean isZero = (resto == 00.00);

        System.out.println(isZero);

        if (!isZero){
            System.out.println("tem um resto ai");
        }


    }
}
