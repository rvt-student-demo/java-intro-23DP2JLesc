package lv.rvt;

import java.util.*;

public class App 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
        System.out.println("Input numbers.");
        int number = Integer.valueOf(scanner.nextLine());

        if (number == 0) {
            System.out.println("0");
            
        }

        else if (number > 0) {
            System.out.println(number*number);
            
        }
        else if (number < 0) {
            System.out.println("Unsuitable number");
            
        }
}

    }
}
