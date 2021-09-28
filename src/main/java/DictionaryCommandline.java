import java.util.ArrayList;

public class DictionaryCommandline {
    private static DictionaryManagement dictionaryManagement = new DictionaryManagement();
    private static Dictionary newDictionary = dictionaryManagement.getDictionary();
    private static ArrayList<Word> newWords = newDictionary.getWords();

    private static void showAllWords(){
        System.out.format("%-5s %-30s %-30s \n", "No", "| English", "| Vietnamese");
        for(int i = 0; i< newWords.size(); i++){
            System.out.format("%-5s %-30s %-30s \n", (i+1), "| " + newWords.get(i).getWord_target(), "| " + newWords.get(i).getWord_explain());
        }
    }

    public static void dictionaryBasic(){
        dictionaryManagement.insertFromCommandline();
        showAllWords();
    }

    public static void dictionaryAdvanced(){
        dictionaryManagement.insertFromFile();
        showAllWords();
        dictionaryManagement.dictionaryLookup();
    }

    public DictionaryManagement getDictionaryManagement(){
        return dictionaryManagement;
    }

    public static void main(String[] args){
        dictionaryAdvanced();
    }

}
