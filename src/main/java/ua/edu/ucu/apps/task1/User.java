package ua.edu.ucu.apps.task1;

import java.util.List;

import lombok.Builder;
import lombok.ToString;

@Builder @ToString
public class User {
    private String name;
    private int age;
    private String gender;
    private double weight;
    private double height;
    private List<Integer> grades;
}
