package Accessmodifier_default;

import static Accessmodifier_private.assgn3_public.m03;
import static Accessmodifier_public.assgn1_public.m01;
import static Accessmodifier_public.assgn2_public.m02;

/*
Write a program to demonstrate the public access modifier and validate:

- within different class in different package.
 */
public class assgn4_public {
    public static void main(String[] args) {
        System.out.println("Main class default package");
        m01();
        m02();
        m03();
        m04();
    }
    public static void m04(){
        System.out.println("default package with different class");
    }
}
