
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Experiment with your program here
        System.out.println("Enter your edge length here.");
        int edgeLength = scanner.nextInt();
        Cube cube1 = new Cube(edgeLength);
        System.out.println(cube1);
    }
}
