package constructor_chaining;
////Create a parent class and child class use super()
public class child1 extends parent1 {
    child1()
    {
        this(2);
        System.out.println("default child1 const");
    }
    child1(int a)
    {
        this(2,3.5);
        System.out.println("int  from child1 with 1 param const");
    }

    child1(int a , double b)
    {
        super(2,5.2);
        System.out.println("int and double from child1 with 2 param const");
    }

    child1(int a, double b, char c)
    {
        System.out.println("int, double and char from child1 using 3 param const");
    }

    public static void main(String[] args) {
        new child1(); // object creation
    }
}

/*
"int, double and char from parent1 using 3 param const"
"int and double from parent1 with 2 param const"
"int and double from child1 with 2 param const"
"int  from child1 with 1 param const"
"default child1 const"
 */
