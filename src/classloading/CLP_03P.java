package classloading;
/*
Class loading process using 2class(1parent and other child) -> method overloading(non static and static method) ,
constructor chaining(this() and super()) , static member, nonstatic member. method overriding(static and non-static)
 */
public class CLP_03P {
    CLP_03P(){
        this(5.2);
        System.out.println("From default parent method");
    }
    CLP_03P(double d){
        System.out.println("From 1param parent method");
    }

    //static members
    int e=50;

    //Static block
    static
    {
        System.out.println("From static parent block");
    }
    public static void s1pmethod(){
        System.out.println("From static parent method");

    }

    //Nonstatic members
    double f=3.3;

    //Nonstatic block
    {
        System.out.println("From Non static parent block");
    }

    //Nonstatic method
    public void ns1pmethod(){
        System.out.println("From Non static parent method");
    }

    public static void main(String[] args) {
      CLP_03P objp  = new CLP_03P();

      //static members
        System.out.println(objp.e);
        //System.out.println(CLP_03P.e);
    }
}
