public class Operadores {

    public static void main(String[] args) {
        System.out.println("Operadores: ");

        // Arithmetic operators
        int a = 10;
        int b = 5;

        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus

        // Increment and decrement operators
        System.out.println("a++ = " + (a++)); // Post-increment
        System.out.println("++a = " + (++a)); // Pre-increment

        // Comparison operators
        System.out.println("a > b = " + (a > b)); // Greater than
        System.out.println("a < b = " + (a < b)); // Less than
        System.out.println("a >= b = " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b = " + (a <= b)); // Less than or equal to
        System.out.println("a == b = " + (a == b)); // Equal to
        System.out.println("a != b = " + (a != b)); // Not equal to

        // Logical operators
        System.out.println("! (a == b) = " + (!(a == b))); // Logical NOT
        System.out.println("a > 0 && b > 0 = " + (a > 0 && b > 0)); // Logical AND
        System.out.println("a > 0 || b > 0 = " + (a > 0 || b > 0)); // Logical OR

        // Assignment operators
        System.out.println("a = b = " + (a = b)); // Assignment
        System.out.println("a += b = " + (a += b)); // Addition assignment
        System.out.println("a -= b = " + (a -= b)); // Subtraction assignment
        System.out.println("a *= b = " + (a *= b)); // Multiplication assignment
        System.out.println("a /= b = " + (a /= b)); // Division assignment
        System.out.println("a %= b = " + (a %= b)); // Modulus assignment

        // Bitwise operators
        System.out.println("a << 2 = " + (a << 2)); // Left shift
        System.out.println("a >> 1 = " + (a >> 1)); // Right shift
        System.out.println("a >>> 1 = " + (a >>> 1)); // Unsigned right shift
        System.out.println("a & 3 = " + (a & 3)); // Bitwise AND
        System.out.println("a | 2 = " + (a | 2)); // Bitwise OR
        System.out.println("a ^ 2 = " + (a ^ 2)); // Bitwise XOR

        // Boolean operators
        boolean aBool = true;
        boolean bBool = false;

        System.out.println("aBool && bBool = " + (aBool && bBool)); // Logical AND
        System.out.println("aBool || bBool = " + (aBool || bBool)); // Logical OR
        System.out.println("!aBool = " + (!aBool)); // Logical NOT

        System.out.println("aBool = bBool = " + (aBool = bBool)); // Assignment

        // Character operators
        char aChar = 'A';
        char bChar = 'B';

        System.out.println("aChar + bChar = " + (aChar + bChar)); // Addition

        // Array operators
        int[] aArray = {1, 2, 3};
        int[] bArray = {4, 5, 6};

        System.out.println("aArray == bArray = " + (aArray == bArray)); // Reference equality
        System.out.println("aArray != bArray = " + (aArray != bArray)); // Reference inequality
    }
}