package classloading;
/*
Class loading process: Write a program - create 1 default , create 1 param constructor, static member,nonstatic member,
 inside main: create 1 object with default constructor, create another object with param constructor,
 call the Static and nonstatic methods using both objects
 */
/* 1.  execution start from main block 1 line only
   2. All static members are loaded first
   3. object from main block call constructor --> body will not execute
   4. All nonstatic members are loaded
   5. Body of constructor is loaded
   6. Again it back to main block where object called constructor.
   7. next line of main block that is 2nd object line will execute, which call constructor
   8. which load all nonstatic member only
   9. return to 2nd object and execute the constructor body of next constructor.
 */
public class CLP_01 {
    //default const
    CLP_01()
    {
        System.out.println("From default constructor");
    }
    //single param const
    CLP_01(int a)
    {
        System.out.println("From 1 param const");
    }
    //static members

    //static variable
    static int b=10;
    static char c = 'd';

    // static block
    static
    {
        System.out.println("From static block");
    }

    // static method
    public static void s1method(){
        System.out.println("From static s1method");
    }

    //Nonstatic members

    //Nonstatic variable
     double d=30;

    // Nonstatic block

    {
        System.out.println("From  Non static block");
    }

    // Nonstatic method
    public void s2method(){
        System.out.println("From Non static s2method");
    }

    public static void main(String[] args) {
      CLP_01 obj = new CLP_01();
      CLP_01 obj1 = new CLP_01(10);
      obj.s1method();
      obj.s2method();

    }

}

/*
"From static block"
"From  Nonstatic block"
"From default constructor"
"From  Non static block"
"From 1 param const"
"From static s1method"
"From Non static s2method"
 */

/*
1. line 61 where main method there start execution
2. line 31 it will allocate memory to int 4 bytes store in address b
3. line 32 it will allocate memory to char 1 byte store in address c
4. line 37 static block execute ("From static block") --->1
5. line 41 method is not called so not execute
6. line 62 which has obj will call  default constructor
7. line 48 it will allocate memory to double 8 bytes store in address d
8. line 53 Nonstatic block will execute("From  Non static block")--->2
9. line 57 Nonstatic method not called so no execution
10.line 62 object will return and call to default constructor body ("From default constructor") -->3
11.line 63  another obj1 will call to line 45 it will allocate memory to double 8 bytes store in address d
12.line 53 Nonstatic block will execute("From  Non static block")--->4
13.linr 57 method not called so no execution
13.line 63 call line no 26 (("From 1 param const")  --->5
14.line 64 it will call s1 method ("From static s1method")  --->6
15.line 65 it will call s2 method ("From Non static s2method")  --->7
 */