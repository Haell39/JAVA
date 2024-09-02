import java.util.ArrayList;
import java.util.List;

public class JavaFundamentals {

    public static void main(String[] args) {

        // 1. Variables and Data Types
        int age = 30;          // Integer
        double price = 19.99;   // Floating-point number
        char grade = 'A';       // Single character
        boolean isActive = true; // Boolean (true/false)
        String name = "Alice";   // String (sequence of characters)

        System.out.println("Name: " + name + ", Age: " + age);

        // 2. Operators
        int sum = 5 + 3;         // Arithmetic: addition
        int difference = 10 - 4; // Arithmetic: subtraction
        boolean isEqual = 5 == 5; // Relational: equality
        boolean isGreater = 8 > 3; // Relational: greater than
        boolean isTrue = isActive && (age > 25); // Logical: AND

        // 3. Control Flow (if, else, switch)
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good");
                break;
            default:
                System.out.println("Needs improvement");
        }

        // 4. Loops (for, while, do-while)
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }

        int count = 0;
        while (count < 3) {
            System.out.println("Counting: " + count);
            count++;
        }

        do {
            System.out.println("Do-while loop");
        } while (false); // Executes at least once

        // 5. Arrays and Lists
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array element at index 2: " + numbers[2]);

        List<String> names = new ArrayList<>();
        names.add("Bob");
        names.add("Charlie");
        System.out.println("List size: " + names.size());

        // 6. Methods and Method Overloading
        greet("John");
        greet("Emily", 25); // Overloaded method

        // 7. Classes and Objects
        Person person = new Person("Alice", 30);
        System.out.println(person.getName() + " is " + person.getAge() + " years old.");

        Student student = new Student("Bob", 20, "Computer Science");
        System.out.println(student.getName() + " studies " + student.getMajor());

        // 8. Exception Handling
        try {
            int result = 10 / 0; // Division by zero
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method Example
    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Overloaded Method Example
    static void greet(String name, int age) {
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    } 
}

// Class Example
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Inheritance Example
class Student extends Person {
    private String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }
}
