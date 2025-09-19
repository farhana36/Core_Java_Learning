package Accessmodifier_private;
/*
"Write a program to demonstrate the private access modifier and validate:
- within same class.  --->
- within different class in same package.
- within different class in different package."
 */
public class ass1_private {
    public static void main(String[] args) {
        n01();
        System.out.println("Main method with Private  class");

    }
    private static void n01(){
        System.out.println("Private within same class");
    }
}
