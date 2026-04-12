package Package1.Generics;

import java.util.*;

abstract class JobRole {}
class SoftwareEngineer extends JobRole {}
class DataScientist extends JobRole {}

class Resume<T extends JobRole> {
    T role;

    Resume(T role) {
        this.role = role;
    }
}

class ResumeSystem {
    public static void process(List<? extends JobRole> roles) {
        for (JobRole r : roles) {
            System.out.println(r.getClass().getSimpleName());
        }
    }
}
