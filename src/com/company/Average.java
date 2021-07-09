package com.company;

public class Average {

    public static float averageOfValues(Person[] persons) {
        // average = sum of values / number of values
        // Initialize a variable to hold the sum of the values
        float sum = 0;

        // Loop through the persons and add all the values of their ages together
        for (int i = 0; i < persons.length; i++) {
            // add the age of the current person to the sum
            sum += persons[i].getAge();
        }

        // Return the average value to the method call.
        return sum / persons.length;

    }

}