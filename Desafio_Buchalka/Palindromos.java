package AtividadesCurso;

public class Palindromos {
    public boolean isPalindrome ( int number){
        int reversed = 0;
        int numberOrig = number;
        while ( number != 0 ){
            int lastDigit = number % 10;

            reversed = reversed * 10 + lastDigit;
            number = number / 10;
        }
        if(reversed == numberOrig){
            return true;
        }
        else{
            return false;
        }
    }

}
