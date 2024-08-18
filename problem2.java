import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        int first,second,add,substract,multiply;
        float division;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        first = scanner.nextInt();
        second = scanner.nextInt();

        add = first + second;
        substract = first - second;
        multiply = first * second;
        division = (float) first / second;

        System.out.println("Sum = "+add);
        System.out.println("Difference = "+substract);
        System.out.println("multiply = "+multiply);
        System.out.println("Division = "+division);

    }
}
