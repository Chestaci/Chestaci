package Thinking_in_Java.Chapter_20.Ex_1;

import Thinking_in_Java.Chapter_20.Ex_1.Constraints;

public @interface Uniqueness {
    Constraints constraints()
            default @Constraints(unique=true);
}
