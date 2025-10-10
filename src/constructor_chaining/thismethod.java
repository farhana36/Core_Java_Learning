package constructor_chaining;
//Create a class, define 5 constructors --> use this() to achieve constructor chaining
public class thismethod {
    thismethod()
    {
      this(3);
        System.out.println("Default method");
    }

    thismethod(int a)
    {
        this(2, 3.2);
        System.out.println("int with 1 param" + a);
    }

    thismethod(int c, double d)
    {
      this(4,5.2,'c');
        System.out.println("int and double with 2 param" + c+d);

    }

    thismethod(int e, double b, char g)
    {
        this(g);
        System.out.println("int, double and char with 3 param " + e  + b  + g);
    }
    thismethod(char c)
    {
        System.out.println("with 1 char param " + c);
    }

    public static void main(String[] args) {
        new thismethod();

    }

}
/*
with 1 char param c
int, double and char with 3 param , 4 ,5.2, c
int and double with 2 param  2, 3.2
int with 1 param  3
Default method
 */