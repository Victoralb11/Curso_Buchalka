package teste_1;

public class buchalkaDesafio3 {

    public static void main(String[] args) {
        String nome = "Victor";
        int score = 1200;
        int posicao = highScorePosition(score);
        displayPlayerHighScore(nome,score,posicao);
    }
    public static void displayPlayerHighScore(String nome,int score ,int scorePosition){
       System.out.println( nome + " Fez : " + score + " Pontos, logo sua posição foi "+ scorePosition);
    }
    public static int highScorePosition(int score){
        if (score >= 1000){
            return 1;
        }else if (score < 1000 && score >= 500){
            return 2;
        }else if (score < 500 && score >= 100){
            return 3;
        }else {
            return 4;
        }

    }
}
