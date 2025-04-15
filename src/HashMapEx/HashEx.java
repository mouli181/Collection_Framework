package HashMapEx;

import java.util.HashMap;

public class HashEx {


        public static void main(String[] args) {
            // Creating a HashMap
            HashMap<String, Integer> studentMarks = new HashMap<>();

            // Adding key-value pairs to the HashMap
            studentMarks.put("Arun", 85);
            studentMarks.put("Priya", 92);
            studentMarks.put("Karthik", 78);
            studentMarks.put("Divya", 88);

            // Printing the HashMap
            System.out.println("Student Marks: " + studentMarks);

            // Accessing a value by key
            System.out.println("Marks of Priya: " + studentMarks.get("Priya"));

            // Checking if a key exists
            if (studentMarks.containsKey("Karthik")) {
                System.out.println("Karthik's marks are present in the map.");
            }

            // Removing an entry
            studentMarks.remove("Arun");

            // Iterating over keys and values
            System.out.println("\nIterating over HashMap:");
            for (String name : studentMarks.keySet()) {
                int marks = studentMarks.get(name);
                System.out.println(name + " -> " + marks);
            }
        }
    }


