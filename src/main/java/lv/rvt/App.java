package lv.rvt;

import java.util.*;

import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        printUntilNumber(5);
       
    }
    public static void printUntilNumber(int first) {
        int i = 1;
        while(i != first+1){
            System.out.println(i);
            i++;
        }
    }
}