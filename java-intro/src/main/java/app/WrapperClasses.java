package app;

public class WrapperClasses {
    public static void Start() {
        // Primitive data types as reference data types;
        // each primitive data type has a correspondent wrapper class
        // contains useful methods
        

        Boolean condition = true;
            System.out.println(condition);
        // autoboxing: automatic conversion when a primitive is assigned to a wrapper class
        
        Character letter = 'A';

        Integer number = 15;
        
        Double doubleNumber = 10.5;
        
        // unboxing: use wrapper class values as if they were primitive
        // it is the reverse of autoboxing
        System.out.println(condition == true);
    }
}
