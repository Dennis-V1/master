
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
        System.out.println("Shall we carry on (enter yes,ye or y to continue and n to stop)?");
        String input = scanner.nextLine();
        if (input.equals("yes")  || (input.equals("ye") || (input.equals("y")) {
            System.out.println("Shall we carry on?");
            } else if (input.equals("n")){
                System.out.println("stop");
            }
        }
    }
}
