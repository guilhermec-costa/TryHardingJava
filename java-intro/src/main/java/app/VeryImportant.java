package app; 

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// target: tells which elements can use that annotation
// retention policy: specifies how long a anntation should live
@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface VeryImportant {
    int times() default 3;
}
