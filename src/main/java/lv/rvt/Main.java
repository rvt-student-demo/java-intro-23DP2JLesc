package lv.rvt;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("/workspaces/java-intro-23DP2JLesc/src/main/resources/person.csv"))) {
            String line;
            br.readLine(); 

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String name = data[0].trim();
                int age = Integer.parseInt(data[1].trim());
                double weight = Double.parseDouble(data[2].trim());
                double height = Double.parseDouble(data[3].trim());

                persons.add(new Person(name, age, height, weight));
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        for (Person person : persons) {
            System.out.println(person);
        }

        double totalAge = 0;
        for (Person person : persons) {
            totalAge += person.getAge();
        }
        double averageAge = persons.isEmpty() ? 0 : totalAge / persons.size();
        System.out.println("Average age: " + averageAge);
    }
}

