import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // Create Input Stream and Scanner..
        FileInputStream fin = new FileInputStream("test.txt");
        Scanner input = new Scanner(fin);

        // Create ArrayList..
        ArrayList<WordsFrequency> aWordsFrequencyList = new ArrayList<>();

        // Create variable of that class..
        WordsFrequency WF = new WordsFrequency();
    }
}


class WordsFrequency {
    
    private String word;
    private int frequency;

    // First Constructor..
    public WordsFrequency()
    {
        this.word = null;;
        this.frequency = 0;
    }

    // Second Constructor
    public WordsFrequency(String word, int frequency)
    {
        this.word = word;
        this.frequency = frequency;
    }

    public int getFrequency(int index)
    {
        return this.frequency;
    }

    public String getWord(String word)
    {
        return this.word;
    }

    @Override
    public String toString(){
        return "" + word + ": " + frequency + "]";
    }
}


