package Inheritance.Multi_Level;

public class parent {
    int parentproperty = 2;
    int parentcar = 2;
    int parentbldg = 2;

    public static void parentmethod(){
        System.out.println("From Parent Method");
    }

    public static void main(String[] args) {
       parent objparent= new parent();
        System.out.println(objparent.parentproperty);
        System.out.println(objparent.parentcar);
        System.out.println(objparent.parentbldg);
        objparent.parentmethod();
    }

}
