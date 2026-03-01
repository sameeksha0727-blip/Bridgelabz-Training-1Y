package com.school.util;

import com.school.data.Student;

public class Analyzer {

    public double calculateAverage(Student s) {
        return (s.getMarks1() + s.getMarks2() + s.getMarks3()) / 3.0;
    }

    public String findGrade(double average) {

        if (average >= 90)
            return "A+";
        else if (average >= 75)
            return "A";
        else if (average >= 60)
            return "B";
        else if (average >= 50)
            return "C";
        else
            return "Fail";
    }
}
