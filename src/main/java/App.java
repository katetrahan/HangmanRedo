import models.Game;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        boolean comparison = true;

        System.out.println("Ready to play hangman?");

        while(comparison) {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            try {
                String letterGuess = bufferedReader.readLine();
                Game newGame = new Game(letterGuess);
                //String newLetterGuess = bufferedReader.readLine();

                System.out.println(newGame.getMatchList());

                if (newGame.getMatchList().equals(newGame.getSplitUpWordList())) {
                    System.out.println("YOU WIN!");
                    comparison = false;

                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            }
        }
    }

