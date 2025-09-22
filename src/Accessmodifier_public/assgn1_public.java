package Accessmodifier_public;
/*
Write a program to demonstrate the public access modifier and validate:
- within same class.
- within different class in same package.
- within different class in different package.
 */
public class assgn1_public {
    public static void main(String[] args) {
        m01();
        System.out.println("public");

    }


    public static void m01()
    {
        System.out.println("Within same class");
    }

}
