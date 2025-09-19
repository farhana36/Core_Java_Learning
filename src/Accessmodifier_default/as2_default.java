package Accessmodifier_default;

import static Accessmodifier_default.as1_default.p1;

/*
"Write a program to demonstrate the default access modifier and validate:
- within same class.
- within different class in same package.--->
- within different class in different package."
 */
public class as2_default {
    public static void main(String[] args) {
        System.out.println("Main method  within different class in same package");
        p1();
        p2();

    }
    static void p2(){
        System.out.println("p2 method");
    }
}
