package app;

@FunctionalInterface
public interface IPrintable {
    // when an interface has exactly one abstract method, it is called a functional interface
    
    // abstract method
    // SAM interfaces: single abstract method interfaces
    // lambda expressions can only be used in a context of SAMs
    // so, lambdas are a shortcut to define a implementation of a functional interface
    void print(String suffix);
    }
