package Interface;
/*
Write a program to demonstrate interface --- 2 - 3 program (implements, extends
 */
public interface I_01 {
    int a = 10;
    // int a =20;  variable are static and final, hence cannot be used

    //Static method
    public static void m01() {          // static word are mandatory
        System.out.println("From static m01 method");
    }

    default void m02() {                // default word are manadatory
        System.out.println("From default m02 method");

    }

    void m03();     // abstract method, no implementation without { }

    abstract  void m04();  // abstract is a kery word can be used or not, it will be default in interface

}

