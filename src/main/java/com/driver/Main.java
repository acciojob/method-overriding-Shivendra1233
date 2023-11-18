package com.driver;
 class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

// Task 2: Create a class B which extends class A
class B extends A {
    // Task 4: Override the method meth in class B
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class Main {
    public static void main(String[] args) {
        // Task 3: Create an object of class B
        B objB = new B();

        // Task 5: Call the overridden method from obj of class B
        System.out.println(objB.meth());
    }
}
