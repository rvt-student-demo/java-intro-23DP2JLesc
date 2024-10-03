package lv.rvt;

import java.util.*;

import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        printUntilNumber(5, 20);
       
    }
    public static void printUntilNumber(int first, int second) {
        while(first != second){
            if (first%3 == 0){
                System.out.println(first);
            }
            first++;
        }
    }
}