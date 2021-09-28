import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

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

    public void insertFromFile(){
        try{
            File file;
            file = new File("E:\\javaproject\\Dictionary project\\src\\main\\java\\dictionaries.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                String[] s = sc.nextLine().split("\t");
                String English = s[0];
                String translate = s[1];
                Word nword = new Word(English, translate);
                dictionary.insertWords(nword);
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public void dictionaryLookup(){
        System.out.println("Nhap tu ban muon tim: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        for(Word words : dictionary.getWords()){
            if(words.getWord_target().contains(input) == true){
                System.out.println(words.getWord_explain());
            }
        }
    }

    public Dictionary getDictionary(){
        return dictionary;
    }


}
