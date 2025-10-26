package classloading;
/*
Class loading process:
- child: create 3 constructor - add this(), super(a), 1 only body(no need to write super() or this())
- Parent: create 3 constructor - add this(), this(b)
 */
public class CLP_05P {
    CLP_05P(){
        this(5.2);
        System.out.println("From default parent method");
    }
    CLP_05P(double d){
        this(3,5.2);
        System.out.println("From 1param parent method");
    }

    CLP_05P(int a, double e){
        System.out.println("From 2param parent method");
    }

    //static members
    int k=50;

    //Static block
    static
    {
        System.out.println("From static parent block");
    }
    public static void s5pmethod(){
        System.out.println("From static parent method");

    }

    //Nonstatic members
    double l =8.3;

    //Nonstatic block
    {
        System.out.println("From Non static parent block");
    }

    //Nonstatic method
    public void ns5pmethod(){
        System.out.println("From Non static parent method");
    }

    public static void main(String[] args) {
        CLP_05P objp  = new CLP_05P();

        //static members
        System.out.println(objp.k);
        //System.out.println(CLP_03P.e);
    }
}
