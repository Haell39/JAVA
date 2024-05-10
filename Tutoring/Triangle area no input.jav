import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor da base do triangulo:");
        double base = scanner.nextDouble();
        
        System.out.println("Digite o valor da altura do triangulo:");
        double height = scanner.nextDouble();
        
        double area = TriangleArea.area(base, height);
        
        System.out.println("A area do triangulo e: " + area);
        
        scanner.close();
    }
}

class TriangleArea {
    public static double area(double base, double height) {
        return (base * height) / 2;
    }
}
