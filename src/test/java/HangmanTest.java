import org.junit.*;
import models.Hangman;
import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.*;
/**
 * Created by Guest on 1/3/18.
 */
public class HangmanTest {
    @Test
    public void newHangman_instantiatesCorrectly() {
        Hangman testHangman = new Hangman("success", 4);
        assertTrue(testHangman instanceof Hangman);
    }
    @Test
    public void _instantiatesCorrectly() {
        Hangman testHangman = new Hangman("success", 3);
        assertTrue(true);
        assertEquals(true, testHangman instanceof Hangman);
    }
    @Test
    public void hangman_indexMatches_List_Integer() {
        Hangman testHangman = new Hangman("success", 4);
        List<Integer> expectedOutput = new ArrayList<Integer>();
        expectedOutput.add(4);
        assertEquals(expectedOutput, testHangman.indexMatches('e'));
    }

}
