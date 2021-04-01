
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number 1.");
        int num1 = scanner.nextInt();
        System.out.println("enter number 2.");
        int num2 = scanner.nextInt();
        int num3 = num1+num2;
        double squareRoot = Math.sqrt(num3);
        System.out.println(squareRoot);
    }
}
