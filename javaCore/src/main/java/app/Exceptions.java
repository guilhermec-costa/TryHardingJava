package app;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exceptions {
    public static void Start() {
        /*
         *  Checked Exceptions: java obligates you to deal with that exception during compile time
         *  readFile, for example, can throw an error if the file does not exist. So you have to deal with this except.
         * */
        FileReader fileReader;
        try {
            fileReader = new FileReader("teste.txt");
            System.out.println(fileReader.getClass());
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }         try {
            System.out.println("Before the exception");
            int number = Integer.parseInt("4");
            System.out.println("I'm not going to be executed after the error was throwned");
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println("I'm only executed if a error is throwned");
            System.out.println("It is possible to use the same catch block to various different exceptions");
            System.out.println(e.getMessage());
        } catch(Exception e) {
            System.out.println("Unexpected error catched if none of the catchers were enough");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("i'm executed regardless of the try catch block");
        }
    }
	@Override
	public String toString() {
		return "Exceptions []";
	}

    
}
