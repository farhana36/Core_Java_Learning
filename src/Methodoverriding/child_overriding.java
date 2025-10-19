package Methodoverriding;
/*
Write a program for method Overriding by creating 2 methods in parent and 2 method
in child where 1 of the method will be overridden
 */
public class child_overriding extends parent_overiding {
    public void car(){
        System.out.println("From child class car");
    }

    @Override
    public void property() {
        //super.property();
        System.out.println("From child class property");
    }

    public static void main(String[] args) {
        child_overriding objchild= new child_overriding();
        objchild.property();
        objchild.car();

    }
}
