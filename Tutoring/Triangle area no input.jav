
public class TriangleArea {
    public static double area(double base1, double base2, double height) {
        double semiPerimeter = (base1 + base2 + height) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - base1) * (semiPerimeter - base2) * (semiPerimeter - height));
    }
}


