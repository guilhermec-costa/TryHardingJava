package PScanner;
import java.util.Scanner;

public class FScanner {
    public static void Start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name 1: ");
        String name1 = scanner.nextLine();

        int number = scanner.nextInt();
        System.out.println(number);
        scanner.nextLine();
        // it is important to clear the "\n" after submit the nextInt() read

        System.out.println("What's your name 2: ");
        String name2 = scanner.nextLine();

        System.out.println(name1);
        System.out.println(number);
        System.out.println(name2);

        scanner.close();
    }
}
