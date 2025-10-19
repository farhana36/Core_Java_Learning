package Encapsulation;
/*
Write a program to demonstrate the concept of Encapsulation:
make 4 members as private.
create a getter and setter methods for all private member.
update the implementations and use it in other class.
 */
public class pg2 extends  pg1 {

    public static void main(String[] args) {
        pg2 obj = new pg2();
        obj.seta(100);
        obj.setB(20.0);
        obj.setC('c');
        obj.setS("Hello");

        System.out.println(obj.geta());
        System.out.println(obj.getB());
        System.out.println(obj.getC());
        System.out.println(obj.getS());
    }
}
