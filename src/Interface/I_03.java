package Interface;
/*
Write a program to demonstrate interface --- 2 - 3 program (implements, extends
 */
public interface I_03 {

     void m07();

     void m08();

    default void m02() {                // default word are manadatory
        System.out.println("From default m02 method");

    }

    void m03();     // abstract method, no implementation without { }

    abstract  void m04();


}
