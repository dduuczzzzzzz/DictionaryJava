import java.util.List;
import java.util.Scanner;

public class DictionaryCommandline {
    private static final DictionaryManagement dictionaryManagement = new DictionaryManagement();
    private static final Dictionary newDictionary = dictionaryManagement.getDictionary();
    private static final List<Word> newWords = newDictionary.getWords();

    private static int getRequest() {
        System.out.println();
        System.out.println("Gõ 1: Tra 1 từ\tGõ 2: Thêm từ mới");
        System.out.println("Gõ 3: Xoá 1 từ\tGõ 4: Xem toàn bộ từ");
        System.out.println("Gõ 5: Tìm bằng chữ cái\tGõ 6: Sửa từ");
        System.out.println("Gõ 0: Thoát");
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        if (n == 1 || n == 2 || n == 3 || n == 4 || n == 5 || n == 6 || n == 0) {
            return n;
        } else {
            System.out.println("Khong hop le");
            return getRequest();
        }
    }

    private static void showAllWords() {
        System.out.format("%-5s %-30s %-30s \n", "No", "| English", "| Vietnamese");
        for (int i = 0; i < newWords.size(); i++) {
            System.out.format("%-5s %-30s %-30s \n", (i + 1), "| " + newWords.get(i).getWord_target(), "| " + newWords.get(i).getWord_explain());
        }
    }

    /*
        public static void dictionaryBasic(){
            dictionaryManagement.insertFromCommandline();
            showAllWords();
        }
    */
    public static void dictionaryAdvanced() {
        dictionaryManagement.insertFromFile();
        //showAllWords();
        //dictionaryManagement.dictionaryLookup();
    }

    public static void dictionarySeacher() {
        System.out.println("Nhap tu ban muon tim: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        for (Word words : dictionaryManagement.getDictionary().getWords()) {
            if (words.getWord_target().contains(input)) {
                System.out.println(words.getWord_target() + "\t" + words.getWord_explain());
            }
        }
    }
    /*
    public DictionaryManagement getDictionaryManagement() {
        return dictionaryManagement;
    }
    */
    public static void main(String[] args) {
        dictionaryAdvanced();
        boolean isRunning = true;
        System.out.println("//////////////////////////////////////////");
        System.out.println("//    Simple English-Vietnamese dict    //");
        System.out.println("//////////////////////////////////////////");
        while (isRunning) {
            switch (getRequest()) {
                case 1:
                    dictionaryManagement.dictionaryLookup();
                    break;
                case 2:
                    dictionaryManagement.insertFromCommandline();
                    break;
                case 3:
                    dictionaryManagement.removeWord();
                    break;
                case 4:
                    showAllWords();
                    break;
                case 5:
                    dictionarySeacher();
                    break;
                case 6:
                    dictionaryManagement.changeWord();
                    break;
                case 0:
                    isRunning = false;
                    break;
                default:
            }
        }
    }
}
