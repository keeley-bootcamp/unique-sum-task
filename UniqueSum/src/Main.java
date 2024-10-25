import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // return the sum of unique numbers
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer value: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter another integer value: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter another integer value: ");
        int num3 = scanner.nextInt();

        System.out.println(CalculateSum.uniqueSum(num1, num2, num3));
    }
}