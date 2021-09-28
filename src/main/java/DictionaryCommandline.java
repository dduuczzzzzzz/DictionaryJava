import java.util.ArrayList;
import java.util.Scanner;

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

    public static void dictionarySeacher(){
        System.out.println("Nhap tu ban muon tim: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        for(Word words : dictionaryManagement.getDictionary().getWords()){
            if(words.getWord_target().contains(input)){
                System.out.println(words.getWord_target() + "\t" + words.getWord_explain());
            }
        }
    }

    public DictionaryManagement getDictionaryManagement(){
        return dictionaryManagement;
    }

    public static void main(String[] args){
        dictionaryAdvanced();
        //dictionarySeacher();
    }

}
