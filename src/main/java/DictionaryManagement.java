import java.util.Scanner;
import java.util.ArrayList;

public class DictionaryManagement {
    private static Dictionary dictionary = new Dictionary();

    public void insertFromCommandline(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i<n; i++){
            Scanner input = new Scanner(System.in);
            String English = input.nextLine();
            String translate = input.nextLine();
            Word nword = new Word(English, translate);
            dictionary.insertWords(nword);
        }
    }

    public Dictionary getDictionary(){
        return dictionary;
    }


}
