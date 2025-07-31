package teste_1;

public class desafioWhile {
    public static void main(String[] args) {
        int v = 5;
        int contador = 0;
        while (v <= 20 && contador < 5) {
            if (isEven(v)) {
                System.out.println(v);

                contador++;
            }

            v++;

        }
        System.out.println("numero de pares: " + contador);
    }


    public static boolean isEven(int x) {

        if (x % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}


