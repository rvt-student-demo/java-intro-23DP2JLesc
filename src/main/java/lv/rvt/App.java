package lv.rvt;

import java.util.*;

public class App{
    public static void main(String[] args) {       
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> wordList = new ArrayList<>();

        System.out.println();
        while(true){
            String input = scanner.nextLine();
            int a = Integer.valueOf(input);
            if(a == 0) {
                break;
            }
            wordList.add(a);
        }
        if (wordList.size() > 2){
            int b = wordList.get(1) + wordList.get(2);
            System.out.println(b);
        } else{
            System.out.println();
        }
        scanner.close();
    
    }
}
