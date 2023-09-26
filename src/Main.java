import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.*;

public class Main {
    private static final Logger log = Logger.getLogger("Main");

    private static int get_int() {
        System.out.print("Please enter an integer: ");
        Scanner in = new Scanner(System.in);
        int res;
        try {
            res = in.nextInt();
        } catch (InputMismatchException e) {
            log.log(Level.WARNING, "Input an integer please, e.x. '10'");
            System.out.println("- - - -");
            return get_int();
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("What is your age?");
        int res = get_int();
        if (res >= 21) {
            System.out.println("You get a wristband!");
        }
    }
}