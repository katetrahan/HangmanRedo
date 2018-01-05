import models.Game;
import org.junit.*;
import static org.junit.Assert.*;

public class GameTest {
    @Test
    public void newGame_instantiatesCorrectly() {
        Game testGame = new Game("a");
        assertEquals(true, testGame instanceof Game);
    }

    @Test
    public void newGame_generateWordList_arrayList() {
        Game testGame = new Game("a");
        assertEquals(2, testGame.makeWords());
    }

    @Test
    public void newGame_selectWordFromList_string() {
        Game testGame = new Game("a");
        assertEquals(true, testGame.selectWord());
    }

    @Test
    public void newGame_splitWordToArray_stringArray() {
        Game testGame = new Game("a");
        assertEquals(true, testGame.splitWord());
    }

    @Test
    public void newGame_compareLetters_true() {
        Game testGame = new Game("c");
        assertEquals(true, testGame.compareLetters());
    }
}
