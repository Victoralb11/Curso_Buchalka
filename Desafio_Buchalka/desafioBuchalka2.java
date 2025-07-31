package teste_1;

public class desafioBuchalka2 {
    public static void main(String[] args){
        boolean isGameOver = true;
        int score = 10000;
        int levelCompleted = 8 ;
        int bonus = 200;

        int finalScore = score;

        if (isGameOver){
            finalScore += (levelCompleted * bonus);
            System.out.println("sua pontuação final foi: " + finalScore);
        }
    }
}
