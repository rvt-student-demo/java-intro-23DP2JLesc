package lv.rvt;

import java.util.*;

public class App{
    public static void main(String[] args) {       
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int rand1 = rand.nextInt(10);

        System.out.println("I am thinking of a number from 1 to 10.");
        System.out.println("You must guess what it is in three tries.");
        System.out.println("Enter a guess:");
        while(true){
        int guess = Integer.valueOf(scanner.nextLine());
        if (guess != rand1 ){
            System.out.println("Wrong");
        }
        else{
            System.out.println("Righ!");
            break;
        }
        }
    }
}
