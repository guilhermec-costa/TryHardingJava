package app;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@VeryImportant
public class FAnnotations {

    public static void Start() {
        System.out.println(FAnnotations.class.isAnnotationPresent(VeryImportant.class));

        @SuppressWarnings("unused")
        String name = "churros";

        Phobia phobia = new Phobia("tassalophobia", 3);
        for(Method method : phobia.getClass().getDeclaredMethods()) {
            if(method.isAnnotationPresent(VeryImportant.class)) {
                VeryImportant annotation = method.getAnnotation(VeryImportant.class);
                for(int i=0; i <= annotation.times(); ++i) {
                    try {
                        method.invoke(phobia);
                    } catch(Exception error) {
                        System.out.println(error.getCause());
                    }
                }
            }
        }
        
        Fear fear = new Fear("dark", 4);
        for(Field field : fear.getClass().getDeclaredFields()) {
            if(field.isAnnotationPresent(FieldAnnotation.class)) {
                try {
                    Object value = field.get(fear);
                    if(value instanceof String valueToString) {
                        System.out.println(valueToString.toUpperCase());
                    }
                } catch(IllegalAccessException e) {
                    System.out.println(e.getCause());
                }
            }
        }
    }
    
    public static String anything() {
        return "Anything";
    }
}
