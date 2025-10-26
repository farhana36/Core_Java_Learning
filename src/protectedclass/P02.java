package protectedclass;
/*
Protected:
create 1 package - under this package create 1 parent and 1 child class
--> in parent class create 1 protected method
 --> in child class try to access this method
 */
public class P02 extends P01 {

    public static void main(String[] args) {
        P02 obj=new P02();
        obj.m01(); // default parent method only applicable in same package
        obj.m02(); // protected parent method, can be access from same package or same class or sub class
    }
}
