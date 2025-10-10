package constructor_chaining;
//Create a parent class and child class use super() to achieve constructor chaining
public class Parent {
    Parent()
    {

        System.out.println("Parent Default method");
    }

    Parent(int a)
    {

        System.out.println("Parent method with single param");
    }

    Parent (int c, int d){

        System.out.println(" Parent method with two param");
    }

    Parent(int e, double f, char c){
        System.out.println("Parent method with 3 param");

    }


}
