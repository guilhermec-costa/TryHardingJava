package app;

public class Lambdas {
    public static void Start() {
        Cat cat = new Cat();
        cat.print("Meow");
        // since Cat class implements the "IPrintable" interface, it can be passed as a parameter
        printThing(cat);
        // lambdas work with parameters typed by an interface
        // instead of passing an object that contains an implementation of a specific method
        // defined inside an interface, it can be passed a lambda expression that does that
        // action.
        printThing(suffix ->  System.out.println("Meow"));

        IPrintable lambdaPrintable = (suffix) -> System.out.println(suffix);
    }

        public static void printThing(IPrintable thing) {
            thing.print("Meow");
    }
}
