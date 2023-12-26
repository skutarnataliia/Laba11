package ua.edu.ucu.apps.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User user = Student.builder().name("Natalia")
        .age(18)
        .mark(100)
        .grades(Arrays.asList(85, 93))
        .gender("f")
        .build();
        System.out.println(user);
    }
}