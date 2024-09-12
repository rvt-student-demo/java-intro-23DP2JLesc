package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadi pirmo skaitli");
        int firstnumber = Integer.valueOf(scanner.nextLine());

        System.out.println("Ievadi otro skaitli");
        int secondnumber = Integer.valueOf(scanner.nextLine());

        int result = firstnumber + secondnumber;
        System.out.println(firstnumber + " + " + secondnumber + " = " +result);

    }

}
