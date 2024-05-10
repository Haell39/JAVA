import java.util.Scanner;

public class RectangleAreaInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the length of the rectangle: ");
        double length = input.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = input.nextDouble();
        double area = length * width;
        System.out.printf("The area of the rectangle is: %.2f", area);
    }
}

