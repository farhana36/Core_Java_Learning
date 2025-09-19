package Accessmodifier_private;

//import static Accessmodifier_default.as1_default.p1;
//import static Accessmodifier_default.as2_default.p2;

/*
"Write a program to demonstrate the default access modifier and validate:
- within same class.
- within different class in same package.
- within different class in different package."--->
 */
public class as3_default {
    public static void main(String[] args) {
        System.out.println("Main method within different class in different package ");
        //p2();
        p3();
    }
    static void p3(){
        System.out.println("p3");
       // p1();
    }
}
