package lv.rvt;

import java.util.*;

public class App{
    public static void main(String[] args) {       
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int rand1 = rand.nextInt(10);
        int c = 5;
        System.out.println("I am thinking of a number from 1 to 10.");
        System.out.println("You must guess what it is in three tries.");
        System.out.println("Enter a guess:");
        System.out.println("Your beginning score is "+ c +" points.");
        while(true){
        int guess = Integer.valueOf(scanner.nextLine());
        if (guess != rand1 && rand1 > guess ){
            c = c-1;
            System.out.println("Too low! Your score is now " + c);
            System.out.println("Enter a guess:");
        }else if(guess != rand1 && rand1 < guess ){
            c = c-1;
            System.out.println("Too high! Your score is now " + c);
            System.out.println("Enter a guess:");
        }   
        else{
            System.out.println("You WON the game!");
            System.out.println("Your score is" + c);
            break;
        }
        if(c == 0){
            System.out.println("You lost.");
            System.out.println("Your score is " + c);
        }
        }
    }
}
