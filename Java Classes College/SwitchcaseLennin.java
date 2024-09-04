import java.util.Scanner;

public class SwitchcaseLennin {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual dia da semana é: ");
        String day = scanner.next();

        switch(day) {
            case "Sunday": System.out.println("it is Sunday!");
            break;
            case "Monday": System.out.println("it is Monday!");
                break;
            case "Tuesday": System.out.println("it is Tuesday!");
                break;
            case "Wednesday": System.out.println("it is Wednesday!");
                break;
            case "Thursday": System.out.println("it is Thursday!");
                break;
            case "Friday": System.out.println("it is Friday!");
                break;
            case "Saturday": System.out.println("it is Saturday!");
                break;
        }
    }
}
