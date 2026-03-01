package com.company.main;

import com.company.hr.*;
import com.company.payroll.Payroll;

public class MainApp {
    public static void main(String[] args) {
        Employee e = new Employee(1, "Suhani", "HR", 50000);
        Payroll p = new Payroll();

        e.display();
        p.calculateBonus(e);
        System.out.println("After Bonus:");
        e.display();
    }
}
