package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Value of gift");
        int mark = Integer.valueOf(scanner.nextLine());
        if (mark < 5000) {
            System.out.println("No tax!");
        }
        else if(mark <= 25000){
            double tax = (100+(mark - 5000)*0.08);
            System.out.println("Tax: " + tax);
        }
        else if(mark <= 55000){
            double tax = (1700+(mark - 25000)*0.10);
            System.out.println("Tax: " + tax);
        }
        else if(mark <= 200000){
            double tax = (4700+(mark - 55000)*0.12);
            System.out.println("Tax: " + tax);
        }
        else if(mark <= 1000000){
            double tax = (22100+(mark - 200000)*0.15);
            System.out.println("Tax: " + tax);
        }
        else if(mark > 1000000){
            double tax = (142100+(mark - 1000000)*0.17);
            System.out.println("Tax: " + tax);
        }
        
    }

}
