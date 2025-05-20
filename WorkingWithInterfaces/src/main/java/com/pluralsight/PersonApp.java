package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonApp {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Carl", "Johnson", 22));
        people.add(new Person("Wednesday", "Addams", 19));
        people.add(new Person("Troy", "Bolton", 29));
        people.add(new Person("Wendy", "Wu", 35));
        people.add(new Person("Lance", "Vance", 40));

        Collections.sort(people);
        for (Person person : people) {
            System.out.println(person);
        }

    }
}
