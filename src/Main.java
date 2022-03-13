import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        /* Create Input Stream and Scanner if that possible..*/
        try(FileInputStream fin = new FileInputStream("test.txt");
            Scanner input = new Scanner(fin)) {

            /* Create ArrayList..*/
            ArrayList<WordsFrequency> aWordsFrequencyList = new ArrayList<>();

            while(input.hasNext())
            {
                String FileWord = input.next();
                int flag = 0;
    
                for (int i = 0; i < aWordsFrequencyList.size(); i++)
                {
                    WordsFrequency aWFL = aWordsFrequencyList.get(i);
    
                    String ALword = aWFL.getWord();
                    int ALfrequency = aWFL.getFrequency();
                    
                    /* If the word already exists in our ArrayList we just update the frequency of that letter/string..*/
                    if (ALword.equals(FileWord))
                    {
                        aWordsFrequencyList.set(i, new WordsFrequency(FileWord,ALfrequency+1));
                        flag = 1;
                    }
                }
                
                /* If the word doesn't exists in our ArrayList we "insert" it..*/
                if (flag == 0){
                    aWordsFrequencyList.add (new WordsFrequency(FileWord,1));
                }     
            }

            Collections.sort(aWordsFrequencyList, new Comparator<WordsFrequency>() 
            {
                /* Descending Sort..*/
                public int compare(WordsFrequency o1, WordsFrequency o2)
                {
                    /* comparetTo: returns an integer that defines either a string is "equal" to another string..*/
                    return o1.getWord().compareTo(o2.getWord());
                }
            });

            for(WordsFrequency aWFL: aWordsFrequencyList)
            {
                System.out.println(aWFL);
            }

            fin.close();
            input.close();
        }
        catch(IOException e) {
            System.err.println(e);
        }
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

    public int getFrequency()
    {
        return this.frequency;
    }

    public String getWord()
    {
        return this.word;
    }

    @Override
    public String toString(){
        return "" + word + ": " + frequency + "";
    }
}


