import java.util.ArrayList;

public class Dictionary {
    private static ArrayList<Word> words = new ArrayList<>();

    public static void insertWords(Word newWord){
        words.add(newWord);
    }

    public ArrayList<Word> getWords(){
        return words;
    }
}
