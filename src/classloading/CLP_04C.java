package classloading;
/*
Class loading process using 2class(1parent and other child) -> method overloading(non static and static method) ,
constructor chaining(this() and super()) , static member, nonstatic member. method overriding(static and non-static)
 */
public class CLP_04C extends CLP_03P {
    CLP_04C(){
        this(2.3);
        System.out.println("From default child method");
    }
    CLP_04C(double g){

        System.out.println("From 1 param child method");
    }

    //static members
    static int h=60;

    //Static block
    static
    {
        System.out.println("From static child block");
    }
    public static void s1cmethod(){
        System.out.println("From static child method");

    }

    //Nonstatic members
    double i=3.3;

    //Nonstatic block
    {
        System.out.println("From Non static child block");
    }

    //Nonstatic method
    public void ns1cmethod(){
        System.out.println("From Non static child method");
    }

    public static void main(String[] args) {
        CLP_04C objc=new CLP_04C();

        //static members
        System.out.println(h);
        System.out.println(objc.h);
        s1cmethod();


        //Nonstatic members
        System.out.println(objc.i);
        System.out.println(objc.e); //from parent
        objc.ns1cmethod();
        objc.ns1pmethod();  // from parent
    }

}
/*
1. main method 1st line
2. static members of child class, if it refer to super() then preference goes to parent static method
3. static member of the parent class
4. static member of child class
5. nonstatic member of parent class
6. constructor body of parent class ref(1param)
7. constructor body of parent  def class this()
8. nonstatic member of child class
9. constructor body of child class ref(1param)
10. constructor body of child def class this()
11.return to the object.
12. main method all static members, methods
13. main method all  nonstatic members, methods, whichever is first after object




/*  output
From static parent block
From static child block
From Nonstatic parent block
From 1param parent method
From default parent method
From Nonstatic child block
From 1 param child method
From default child method
60
60
From static child method
3.3
50
From Nonstatic child method
From Nonstatic parent method
 */








