package Accessmodifier_default;
/*
"Write a program to demonstrate the default access modifier and validate:
- within same class.   --->
- within different class in same package.
- within different class in different package."
 */
public class as1_default {
    public static void main(String[] args) {
        System.out.println(" main default");
        p1();
    }
    static void p1(){
        System.out.println("within same class");
    }
}
