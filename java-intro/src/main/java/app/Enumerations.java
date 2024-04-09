package app;

import java.time.DayOfWeek;

public class Enumerations {
    public static void Start() {
       EDaysOfWeek dayOfWeek = EDaysOfWeek.FRIDAY;
       System.out.println(dayOfWeek);
       System.out.println(dayOfWeek == EDaysOfWeek.FRIDAY);
       for(var value : EDaysOfWeek.values()) {
           System.out.println(value);
            System.out.println(value.likeIt);
           System.out.println("============");
       }
    }
}
