package lv.rvt;

import java.util.*;

public class App{
    public static void main(String[] args) {       
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> wordList = new ArrayList<>();

        System.out.println();
        while(true){
            String input = scanner.nextLine();
            if(input.isEmpty()) {
                break;
            }
            wordList.add(input);
        }
        if (wordList.size() > 2){
            System.out.println(wordList.get(2));
        } else{
            System.out.println();
        }
        scanner.close();
    
    }
}
