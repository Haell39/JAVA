import java.util.Scanner;

public class Ifelsebrocode {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How Old are you: ");
        double age = scanner.nextDouble();

        if(age>=60){
            System.out.println("Ok Boomer!");
        }
        else if (age >=18){
            System.out.println("Ok Adult!");

        }
        else if (age <18){
            System.out.println("Ok Teen!");
        }
    }
}
