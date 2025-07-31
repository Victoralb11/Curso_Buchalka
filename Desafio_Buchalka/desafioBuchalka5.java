package teste_1;
import java.util.Scanner;
public class desafioBuchalka5 {
    public static String printDayOfTheWeek(int day){
        switch (day){
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
            default:
                return "Invalid day";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero que representa o dia da semana: ");
        int dia = sc.nextInt();
        System.out.println(printDayOfTheWeek(dia));
    }
}
