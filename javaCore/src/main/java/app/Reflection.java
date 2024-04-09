package app;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Reflection {
    // used mostly in frameworks, like spring.
    // your code gets slower
    
    public static void Start() {
        System.out.println("Reflection");
        Fear ocean = new Fear("Ocean", 4);
        var oceanClassReflection = ocean.getClass();
        Field[] declaredFields = oceanClassReflection.getDeclaredFields();
        Method[] declaredMethods = oceanClassReflection.getDeclaredMethods();
        // getFields: get all fields, regardless it is inherited from another type
        // getDeclaredFields: get all the field defined inside that type. Inherited fields are not considered here
        
        for(Field field : declaredFields) {
            if(field.getName().equals("name")) {
                try {
                    field.setAccessible(true);
                    field.set(ocean, "Gorillas");
                } catch(Exception error) {
                        System.out.println(error.getCause());
                }
            }
        }
    
        System.out.println("====================");
        for(Method method : declaredMethods) {
            try {
                method.setAccessible(true);
                method.invoke(ocean);
                // method.invoke(null) if its static
            } catch(Exception error) {
                System.out.println(error.getCause());
            }
        }
    }
}
