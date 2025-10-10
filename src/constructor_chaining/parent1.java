package constructor_chaining;
//Create a parent class and child class use super() and this() to achieve constructor chaining
public class parent1 {
    parent1()
    {
        this(2);
        System.out.println("default parent1 const");
    }
    parent1(int a)
    {
        this(2,5.2);
        System.out.println("int from parent1 with 1 param const");
    }

    parent1(int a , double b)
    {
        this (2,5.2,'c');
        System.out.println("int and double from parent1 with 2 param const");
    }

    parent1(int a, double b, char c)
    {

        System.out.println("int, double and char from parent1 using 3 param const");
    }


}
