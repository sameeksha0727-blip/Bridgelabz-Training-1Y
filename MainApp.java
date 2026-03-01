package com.school.main;

import com.school.data.*;
import com.school.util.*;

public class MainApp {

    public static void main(String[] args) {

        Student s1 = new Student("Suhani", 85, 78, 92);

        Analyzer analyzer = new Analyzer();

        double avg = analyzer.calculateAverage(s1);
        String grade = analyzer.findGrade(avg);

        System.out.println("---- Student Performance Report ----");
        System.out.println(s1);   // calls toString()
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
    }
}
