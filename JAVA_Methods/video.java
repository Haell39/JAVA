
package JAVA_Methods;

public class video {
    public static void main(String[] args) {
        System.out.println("Methods!");
        // method is a block of code that performs a specific task and can be called multiple times
        // method is a reusable block of code
        // method is a part of a class


        greet("Alice");
        greet("Bob");

        greet2("Alice", 30);


        greetsimple();


        greetcomplex("Alice", 30, 1.75f, 75.5, true);

        // arguments outside the method:
        int age = 30;
        String name = "Loua";

        hello(name, age);


    }

    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    static void greet2(String name, int age) {
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }

    static void greetsimple() {
        System.out.println("Hello, World!");
    }

    static void greetcomplex(String name, int age, float height, double weight, boolean isStudent) {
        System.out.println("Hello, " + name + "! You are " + age + " years old. You are " + height + " meters tall and weigh " + weight + " kilograms. You are a student: " + isStudent);
    }

    static void hello(String name, int age) {
        System.out.println("Hello " + name);
        System.out.println("You are " + age);
    }


}