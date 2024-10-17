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
        if (guess != rand1 && (rand1-guess >= 3 && guess-rand1  <= 3) ){
            System.out.println("Wrong");
            System.out.println("cold");
        }else if(guess != rand1 && (rand1-guess >= 2 && guess-rand1  <= 2) ){
            System.out.println("Wrong");
            System.out.println("warm");
        }
        else if(guess != rand1 && (rand1-guess >= 1 && guess-rand1  <= 1) ){
            System.out.println("Wrong");
            System.out.println("hot");
        }
        else{
            System.out.println("Righ!");
            break;
        }
        }
    }
}
