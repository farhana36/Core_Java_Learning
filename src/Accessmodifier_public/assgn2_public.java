package Accessmodifier_public;

import static Accessmodifier_public.assgn1_public.m01;

/*Write a program to demonstrate the public access modifier and validate:
   within different class in same package.*/
public class assgn2_public {
    public static void main(String[] args) {
        System.out.println("main method different class");
        m02();

    }
    public static void m02(){
        m01();
        System.out.println("Different class");
    }

}
