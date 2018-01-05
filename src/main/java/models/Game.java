package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
    private List<String> wordList;
    private String selectedWord;
    private String[] splitUpWord;
    private List<String> splitUpWordList;
    private String letter;
    private List<String> matchList;
    private String letterGuess;
    private String newLetterGuess;

    public Game (String letterGuess) {
        wordList = new ArrayList<>();
        wordList.add("abc");
        wordList.add("def");

        selectedWord = wordList.get(0);
        splitUpWord = selectedWord.split("");

        splitUpWordList = new ArrayList<>();
        for (int i = 0; i < selectedWord.length(); i++) {
            splitUpWordList.add(splitUpWord[i]);
        }

        letter = letterGuess;
        newLetterGuess = letterGuess;

        matchList = new ArrayList<>();
        matchList.add("-");
        matchList.add("-");
        matchList.add("-");



    }

    public List<String> replaceLetter() {
        for (int i = 0; i < selectedWord.length(); i++) {
            if (letter.equals( splitUpWord[i]) ) {
                matchList.set(i, letter);
            } else {

            }
        }
        return matchList;
    }

    public List<String> getMatchList() {
        return matchList;
    }

    public List<String> getSplitUpWordList() {
        return splitUpWordList;
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
        for (int i = 0; i < selectedWord.length(); i++) {
            if (letter.equals( splitUpWord[i]) ) {
                matchList.set(i, letter);
            } else {

            }
        }
        return true;
    }

}
