package david;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by David on 1/31/2018.
 */
public class Task1_5P4Test {

    @Test
    public void correctWordTest() {
        Task1_5P4 task1_5P4 = new Task1_5P4();

        assertEquals(task1_5P4.correctWord("Google"), "TRUE");
        assertEquals(task1_5P4.correctWord("google"), "FALSE");
        assertEquals(task1_5P4.correctWord("GOOGLE"), "TRUE");
        assertEquals(task1_5P4.correctWord("GoOgLe"), "FALSE");
    }
}
