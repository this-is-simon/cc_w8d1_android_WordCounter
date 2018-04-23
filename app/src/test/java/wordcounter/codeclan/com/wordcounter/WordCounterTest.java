package wordcounter.codeclan.com.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordCounterTest {

    WordCounter wordcounter1;

    @Before
    public void before(){
        wordcounter1 = new WordCounter();
    }

    @Test
    public void canCountWords(){
        assertEquals(5, wordcounter1.countWords("This is 5 words yes"));
        assertEquals(3, wordcounter1.countWords("Go to hell"));
    }


}