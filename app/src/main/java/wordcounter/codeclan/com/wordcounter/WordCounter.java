package wordcounter.codeclan.com.wordcounter;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class WordCounter {

    public int countWords(String paragraphToCount){
        String[] arrayToCount = paragraphToCount.split(" ");
        return arrayToCount.length;
    }


}
