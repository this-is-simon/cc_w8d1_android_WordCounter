package wordcounter.codeclan.com.wordcounter;

public class WordCounter {

    public String countWords(String paragraphToCount){
        String[] arrayToCount = paragraphToCount.split(" ");
        int number = arrayToCount.length;
        String numberAsString = String.valueOf(number);
        return numberAsString;
    }



}
