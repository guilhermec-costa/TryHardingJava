package app;

// records are full feature class that exists to hold data

// generates a cannonycal constructor:
// a constructor that takes as parameters all of the parameters defined in the record
// and automatically sets them
// They can implement interfaces, but can not inherits from other classes
public record EmployeeRecord(String name, int Id) implements IPrey {
    public static String field = "FIELD";

    // it is possible to overwrite the cannonycal constructor
    // public EmployeeRecord(String name, int Id) {
    //     this.name = name.toUpperCase();
    //     this.Id = Id;
    // }
    

    // this is a compact contructor
    // it can contains aditional logic, and even so set the fields specified
    // in the definition of the record
    public EmployeeRecord {
        if(Id < 0) {
            throw new IllegalArgumentException("Employee Id can not be negative");
        }
    }

    public String nameInUpperCase() {
        return this.name.toUpperCase();
    }

    public static void anything() {
        System.out.println("Printing anything");
    }

    @Override
    public void flee() {
        throw new UnsupportedOperationException("Unimplemented method 'flee'");
    }
}

