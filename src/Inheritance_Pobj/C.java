package Inheritance_Pobj;
/*
Practise a program by creating 1 parent and 1 child class
--> Parent obj = new Child(); -- Dynamic Dispatch
 */
public class C extends P {
    //static members
    static int c = 50;

    static{
        System.out.println("From childstatic block");
    }
    static void m03(){
        System.out.println("From child m03  static method");
    }
    //Nonstatic members
    double e= 5.5;

    {
        System.out.println("From child Non static block");
    }
    void m04(){
        System.out.println("From child Non static m04 method");
    }

    //override method
    //@override
    public void display(){
        System.out.println("From child display method");
    }

    public void onlychilddisplay(){
        System.out.println(" From child only display method");
    }

    public static void main(String[] args) {
      // C obj  = new C();
       P obj1 = new C();

       // when object obj ref to C (child) method
//        System.out.println(a);
//        m01();
//        System.out.println(obj.d);
//       obj. m02();
//       obj.display();
//       obj.onlyparentdisplay();

       // when object obj1 ref to P (parent) method
        // from parent class
        System.out.println(a);
        m01();
        System.out.println(obj1.d);
        obj1. m02();
        obj1.display();
        obj1.onlyparentdisplay();

        // from child class, cant access obj related if it is refereing to Parent class
        System.out.println(c);  // static member can access
        m03();
        //System.out.println(obj1.e);
       // obj1. m04();
        obj1.display();    // this only access as it is overridden
        //obj1.onlychilddisplay();



    }

}
