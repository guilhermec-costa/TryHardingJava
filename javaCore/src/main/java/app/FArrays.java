package app;

public class FArrays {
    public static void Start() {
        int[] numbers = new int[10];
        numbers[0] = 15;

        for(int i=0; i < numbers.length; ++i) {
            numbers[i] = i * 2;
        }

        for (int i : numbers) {
            System.out.println(i);
        }

        System.out.println("Length: " + numbers.length);
    }
}
