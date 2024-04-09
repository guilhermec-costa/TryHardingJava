package app;

public class Calculator {

    private static Integer numberOfCalculatorsCreated = 0;

    public Calculator() {
        Calculator.numberOfCalculatorsCreated++;
    }

    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static Integer getNumberOfCalculatorsCreated() {
        return Calculator.numberOfCalculatorsCreated;
    }
}
