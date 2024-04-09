package app;

public class FPrintf {
    public static void Start() {
        final String name = "churros";
        System.out.printf("Hello world!!");
        System.out.printf("My dog %-10s", "churros\n");
        System.out.printf("My dog %d \n", 19);
        System.out.printf("My dog %b \n", true);
        System.out.printf("My dog %c \n", 'C');
        System.out.printf("My dog %.2f \n", 19.5);
    }
}
