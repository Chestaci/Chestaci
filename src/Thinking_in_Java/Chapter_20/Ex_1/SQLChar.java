package Thinking_in_Java.Chapter_20.Ex_1;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SQLChar {
    int value() default 0;
    String name() default "";
    char letter() default '*';
    Constraints constraints() default @Constraints;
}
