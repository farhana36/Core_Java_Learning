package classloading;
/*
Class loading process using 1 class -> method overloading(static and non-static) ,
constructor chaining , static member, nonstatic member
 */
public class CLP_02 {

    CLP_02(){
        this(10);
        System.out.println("From default constructor");
    }
    CLP_02(int b){
        System.out.println("From 1 param constructor");
    }

    //static members
    static int c=20;

    //Static block
    static
    {
        System.out.println("From static block");
    }
    public static void s1method(){
        System.out.println("From static method");

    }

    //Nonstatic members
    double e=2.3;

    //Nonstatic block

    {
        System.out.println("From Non static block");
    }

    //Nonstatic method
    public void ns1method(){
        System.out.println("From non static method");
    }

    public static void main(String[] args) {
       CLP_02 obj =new CLP_02();
       obj.s1method();
       obj.ns1method();
    }


}
/*
"From static block"
"From Non static block"
"From 1 param constructor"
"From default constructor"
"From static method"
"From non static method"
 */