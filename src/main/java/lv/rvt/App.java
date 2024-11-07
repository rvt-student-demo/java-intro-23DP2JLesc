package lv.rvt;

import java.util.*;
import lv.rvt.Person;
import lv.rvt.Product;
import lv.rvt.DecreasingCounter;
import lv.rvt.Agent;

public class App{
    public static void main(String[] args) {
        Agent bond = new Agent("James", "Bond");
        System.out.println(bond); 

        Agent ionic = new Agent("Ionic", "Bond");
        System.out.println(ionic); 
    }
}
