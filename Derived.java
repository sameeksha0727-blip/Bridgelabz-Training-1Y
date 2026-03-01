package com.access.two;

import com.access.one.Base;

public class Derived extends Base {

    public static void main(String[] args) {

        Derived d = new Derived();

        d.publicMethod();       // Accessible
        d.protectedMethod();    // Accessible (via inheritance)

        // d.defaultMethod();   // Not Accessible
        // d.privateMethod();   // Not Accessible
    }
}
