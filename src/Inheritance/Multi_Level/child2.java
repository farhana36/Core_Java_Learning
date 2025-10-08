package Inheritance.Multi_Level;

public class child2 extends child1 {
    int child2property = 4;
    int child2car = 3;
    int child2bldg = 1;

    public static void child2method() {
        System.out.println("From Child2 Method");
    }

    public static void main(String[] args) {
        child2 objchild2 = new child2();
        System.out.println(objchild2.child2property);
        System.out.println(objchild2.child2car);
        System.out.println(objchild2.child2bldg);
        objchild2.child2method();

        System.out.println(objchild2.child1property);
        System.out.println(objchild2.child1car);
        System.out.println(objchild2.child1bldg);
        objchild2.child1method();

        System.out.println(objchild2.childproperty);
        System.out.println(objchild2.childcar);
        System.out.println(objchild2.childbldg);
        objchild2.childmethod();


        System.out.println(objchild2.parentproperty);
        System.out.println(objchild2.parentcar);
        System.out.println(objchild2.parentbldg);
        objchild2.parentmethod();
    }
}
