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

        int result1 = firstnumber - secondnumber;

        int result2 = firstnumber * secondnumber;

        float result3 = firstnumber / secondnumber;

        System.out.println(firstnumber + " + " + secondnumber + " = " +result);

        System.out.println(firstnumber + " - " + secondnumber + " = " +result1);

        System.out.println(firstnumber + " * " + secondnumber + " = " +result2);

        System.out.println(firstnumber + " / " + secondnumber + " = " +result3);

    }

}
