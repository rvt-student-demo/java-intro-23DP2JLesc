package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadi savus puktus 0-100");
        int mark = Integer.valueOf(scanner.nextLine());
        if (mark < 0) {
            System.out.println("Grade: Inpossible!");
        }
        else if(mark <= 49){
            System.out.println("Grade: failed");
        }
        else if(mark <= 59){
            System.out.println("Grade: 1");
        }
        else if(mark <= 69){
            System.out.println("Grade: 2");
        }
        else if(mark <= 79){
            System.out.println("Grade: 3");
        }
        else if(mark <= 89){
            System.out.println("Grade: 4");
        }
        else if(mark <= 100){
            System.out.println("Grade: 5");
        }
        else if(mark > 100){
            System.out.println("Grade: incredible!");
        }

    }

}
