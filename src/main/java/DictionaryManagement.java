import java.util.Scanner;
import java.util.ArrayList;

public class DictionaryManagement {
    private static Dictionary dictionary = new Dictionary();

    public void insertFromCommandline(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i<n; i++){
            String English = scanner.nextLine();
            String translate = scanner.nextLine();
            Word nword = new Word(English, translate);
            dictionary.insertWords(nword);
        }
    }

    public Dictionary getDictionary(){
        return dictionary;
    }


}
