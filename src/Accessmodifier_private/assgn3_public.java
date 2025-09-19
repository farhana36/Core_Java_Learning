package Accessmodifier_private;

import static Accessmodifier_public.assgn1_public.m01;
import static Accessmodifier_public.assgn2_public.m02;

/*
Write a program to demonstrate the public access modifier and validate:

- within different class in different package.
 */
public class assgn3_public {
    public static void main(String[] args) {
        System.out.println("Different package");
        m01();
        m03();
        m02();

    }
    public static void m03(){
        System.out.println("Different package with different class");
    }
}
