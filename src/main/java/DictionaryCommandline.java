import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryCommandline {
    private static DictionaryManagement dictionaryManagement = new DictionaryManagement();
    private static Dictionary newDictionary = dictionaryManagement.getDictionary();
    private static ArrayList<Word> newWords = newDictionary.getWords();

    private static void showAllWords(){
        System.out.format("%-5s %-20s %-20s \n", "No", "| English", "| Vietnamese");
        for(int i = 0; i< newWords.size(); i++){
            System.out.format("%-5s %-20s %-20s \n", (i+1), "| " + newWords.get(i).getWord_target(), "| " + newWords.get(i).getWord_explain());
        }
    }

    public static void dictionaryBasic(){
        dictionaryManagement.insertFromCommandline();
        showAllWords();
    }

    public DictionaryManagement getDictionaryManagement(){
        return dictionaryManagement;
    }

    public static void main(String[] args){
        dictionaryBasic();
    }

}
