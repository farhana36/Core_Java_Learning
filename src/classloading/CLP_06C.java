package classloading;
/*
Class loading process:
- child: create 3 constructor - add this(), super(a), 1 only body(no need to write super() or this())
- Parent: create 3 constructor - add this(), this(b)
 */
public class CLP_06C extends CLP_05P {
    CLP_06C(){
        super();
        System.out.println("From default child method");
    }
    CLP_06C(double g){
        this(5,3.2);
        System.out.println("From 1 param child method");
    }

    CLP_06C(int a, double e)
    {
        System.out.println("From 2param parent method");
    }
    //static members
    static int h=60;

    //Static block
    static
    {
        System.out.println("From static child block");
    }
    public static void s6cmethod(){
        System.out.println("From static child method");

    }

    //Nonstatic members
    double i=3.3;

    //Nonstatic block
    {
        System.out.println("From Non static child block");
    }

    //Nonstatic method
    public void ns6cmethod(){
        System.out.println("From Non static child method");
    }

    public static void main(String[] args) {
        CLP_06C objc=new CLP_06C();

       CLP_06C objc1=new CLP_06C(2.3);
       CLP_06C objc2=new CLP_06C(3,5.2);

        //static members
        System.out.println(h);
        System.out.println(objc.h);
        s6cmethod();


        //Nonstatic members
        System.out.println(objc.i);
        System.out.println(objc.l); //from parent
        objc.ns6cmethod();
        objc.ns5pmethod();  // from parent
    }
}

/*
"From static parent block"
"From static child block"
"From Non static parent block"
"From 2param parent method"
"From 1param parent method"
"From default parent method"
"From Non static child block"
"From default child method"
("From 1 param child method"
"From 2param parent method"
60
60
"From static child method"
3.3
8.3
"From static child method"
"From Non static parent block"
 */