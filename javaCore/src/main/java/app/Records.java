package app;

public class Records {
    public static void Start() {
        EmployeeClass employee = new EmployeeClass("Churros", 3);
        EmployeeRecord employeeRecord = new EmployeeRecord("Churros", 6);
        System.out.println(employeeRecord.name());
        System.out.println(employeeRecord);
        System.out.println(employeeRecord.nameInUpperCase());
        EmployeeRecord.anything();
    }
}
