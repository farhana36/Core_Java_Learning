package Inheritance_Pobj;
/*
Practise a program by creating 1 parent and 1 child class
 --> Parent obj = new Child(); -- Dynamic Dispatch
 */
public class P {
    //static members
    static int a = 5;

    static{
        System.out.println("From parent static block");
    }
    static void m01(){
        System.out.println("From parent m01  static method");
    }
    //Nonstatic members
    double d = 2.5;

    {
        System.out.println("From parent Non static block");
    }
    void m02(){
        System.out.println("From Parent Non static m02 method");
    }

    //override method
    public void display(){
        System.out.println("From parent display method");
    }
    public void onlyparentdisplay(){
        System.out.println(" From Parent only display method");
    }

}
