import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
    private List<String> wordList;
    private String selectedWord;
    private String[] splitUpWord;
    private String letter;
    private List<String> matchList;

    public Game (String letterGuess) {
        wordList = new ArrayList<>();
        wordList.add("abc");
        wordList.add("def");
        selectedWord = wordList.get(0);
        splitUpWord = selectedWord.split("");
        letter = letterGuess;
        for (int i = 0; i < 3; i++) {
            matchList.add(0);
        }
    }

    public int makeWords() {
        return wordList.size();
    }

    public boolean selectWord() {
        Random random = new Random();
//        selectedWord = wordList.get( random.nextInt( wordList.size()) );
        return selectedWord.length() > 0;
    }

    public boolean splitWord() {

        return splitUpWord.length > 0;
    }

    public boolean compareLetters() {
        for (int i = 0; i < selectedWord.length() - 1; i++) {
            if (letter.equals( splitUpWord[i]) ) {
                matchList.set(i, letter);
            } else {
                matchList.set(i, "-");
            }
        }
        return true;
    }

}
