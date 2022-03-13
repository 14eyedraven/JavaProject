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

}


