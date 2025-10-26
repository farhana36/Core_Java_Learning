package protectedclass;
/*
Protected:
create 1 package - under this package create 1 parent and 1 child class
--> in parent class create 1 protected method
--> in child class try to access this method
 */
public class P01 {
    void m01(){
        System.out.println("From parent default method");
    }

    protected void m02(){
        System.out.println("From parent protected method ");
    }
}
