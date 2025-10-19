package Methodoverriding;
/*
Write a program for method Overriding by creating 2 methods in parent and 2 method
in child where 1 of the method will be overridden
 */
public class parent_overiding {
    public void property(){
        System.out.println("From parent class property");
    }
    public void bldg(){
        System.out.println("From parent class bldg");
    }

    public static void main(String[] args) {
         parent_overiding objparent =new parent_overiding();
         objparent.property();
         objparent.bldg();
    }
}
