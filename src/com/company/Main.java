package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // A person class that will have a property of first name,
        // last name, age
        // An average class, that contains one method, to calculate the average
        // of a set of values.

        // Write a program that allows us to create a number of people and
        // find the average age.

        // Initialize the scanner
        Scanner scanner = new Scanner(System.in);

        // Ask the user how many people they want to create
        System.out.print("How many people do you want to create?: ");

        // Create an array of persons.
        Person[] persons = new Person[scanner.nextInt()];

        // Iteratively create new persons and add them to the persons array.
        for (int i = 0; i < persons.length; i++) {

            // Create a new person
            Person person = new Person();

            // Add the person's properties
            System.out.print("Enter your firstName: ");
            person.setFirstName(scanner.next());
            System.out.print("Enter your lastName: ");
            person.setLastName(scanner.next());
            System.out.print("Enter your age: ");
            person.setAge(scanner.nextInt());

            // add this person to the person's array.
            persons[i] = person;

        }


        // Output the average of the ages to the console
        System.out.println("The average age is " + Average.averageOfValues(persons));


        // Write a Circle class, that takes in the radius as a field
        // Create 2 constructors, one with the field as a parameter and one without.
        // write methods find the circumference and area of the circle

    }
}