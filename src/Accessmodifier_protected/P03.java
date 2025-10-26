package Accessmodifier_protected;

import protectedclass.P01;

/*
Protected:
create 2 packages - under package1 create 1 parent - under package2 create 1 child class
--> in parent class create 1 protected method --> in child class try to access this method
 */
public class P03 extends P01 {

    public static void main(String[] args) {
        P03 obj1= new P03();
       // obj1.m01();  // default class from other package cant be access
        obj1.m02(); // protected method from other package, after importing it can be access in different package.
    }
}
