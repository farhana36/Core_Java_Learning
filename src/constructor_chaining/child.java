package constructor_chaining;

public class child extends Parent {
    child()
    {
        super();
        System.out.println("Child Default method");
    }

    child(int a)
    {

        System.out.println("Child method with single param");
    }

    child (int c, int d){

        System.out.println(" Child method with two param");
    }

    child(int e, double f, char c){
        System.out.println("Child method with 3 param");

    }

    public static void main(String[] args) {
        new child(); //object
    }
}

/*
 object will call to default constructor(27), in default const(4) have super()
 which point to parent default method(4 line of parent class) which will print
 "Parent Default method" again parent() which is called by child() which print
 "Child Default method"
 */