package Inheritance.Multi_Level;

public class child1 extends child {
    int child1property = 3;
    int child1car = 2;
    int child1bldg = 1;

    public static void child1method() {
        System.out.println("From Child1 Method");
    }

    public static void main(String[] args) {
        child1 objchild1 = new child1();
        System.out.println(objchild1.child1property);
        System.out.println(objchild1.child1car);
        System.out.println(objchild1.child1bldg);
        objchild1.child1method();

        System.out.println(objchild1.childproperty);
        System.out.println(objchild1.childcar);
        System.out.println(objchild1.childbldg);
        objchild1.childmethod();

        System.out.println(objchild1.parentproperty);
        System.out.println(objchild1.parentcar);
        System.out.println(objchild1.parentbldg);
        objchild1.parentmethod();
    }
}
