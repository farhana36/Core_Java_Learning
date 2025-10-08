package Inheritance.Multi_Level;

public class child extends parent {
    int childproperty = 2;
    int childcar = 1;
    int childbldg = 1;

    public static void childmethod(){
        System.out.println("From Child Method");
    }

    public static void main(String[] args) {
        child objchild= new child();
        System.out.println(objchild.childproperty);
        System.out.println(objchild.childcar);
        System.out.println(objchild.childbldg);
        objchild.childmethod();

        System.out.println(objchild.parentproperty);
        System.out.println(objchild.parentcar);
        System.out.println(objchild.parentbldg);
        objchild.parentmethod();

    }
}
