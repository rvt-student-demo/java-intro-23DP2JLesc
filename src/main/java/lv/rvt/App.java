package lv.rvt;

import java.util.*;

import java.util.Scanner;

public class App
{
public static void main( String[] args )
{
Scanner scanner = new Scanner(System.in);

System.out.println("How many times?");
int number = Integer.valueOf(scanner.nextLine());
int i = number;
while(i > 0 ) {
System.out.println("In a hole in the ground there lived a method");
i = i - 1;
}



}
}