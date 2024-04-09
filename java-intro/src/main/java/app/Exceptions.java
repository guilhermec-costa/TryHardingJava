package app;

public class Exceptions {
    public static void Start() {
        try {
            final float result = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch(Exception e) {
            System.out.println("Unexpected error");
        }
    }
	@Override
	public String toString() {
		return "Exceptions []";
	}

    
}
