import models.Hangman;
import models.Player;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter your name");
            String name = bufferedReader.readLine();
            System.out.println("Enter the number of steps");
            Integer steps = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Enter the secretWord");
            String secretWord = bufferedReader.readLine();
            Player player = new Player(name);
            Hangman hangman = new Hangman(secretWord, steps);
            while(!hangman.isLosser() && !hangman.isWinner()){
                System.out.println("Enter a character");
                char character = bufferedReader.readLine().charAt(0);
                List<Integer> indexs = hangman.indexMatches(character);
                if(indexs.size()>0){
                    hangman.updateGuessWord(indexs, character);
                }
                else {
                    hangman.setSteps(hangman.getSteps()-1);
                }
                System.out.println(hangman.getGuessWord().toString()+"    "+hangman.getSteps());
            }
            if(hangman.isLosser()){
                System.out.println("Sorry "+player.getName()+" you are a losser");
            }
            else{
                System.out.println("Congratulations "+player.getName()+" you are a winner");
            }

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}