import java.util.ArrayList;

public class Dictionary {
    private ArrayList<Word> words = new ArrayList<>();

    public void insertWords(Word newWord){
        words.add(newWord);
    }

    public ArrayList<Word> getWords(){
        return words;
    }
}
