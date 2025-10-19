package Encapsulation;
/*
Write a program to demonstrate the concept of Encapsulation:
make 4 members as private.
create a getter and setter methods for all private member.
update the implementations and use it in other class.
 */
public class pg1 {
    private int a ;
    private double b;
    private char c;
    private String s;

    public int geta()
    {
        return this.a;
    }
    public void seta(int a)
    {
        this.a = a;
    }

    public double getB() {
        return this. b;
    }

    public String getS() {
        return this. s;
    }

    public char getC() {
        return this. c;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(char c) {
        this.c = c;
    }

    public void setS(String s) {
        this.s = s;
    }

    public static void main(String[] args) {
        System.out.println(new pg1().a);
        System.out.println(new pg1().b);
        System.out.println(new pg1().c);
        System.out.println(new pg1().s);

    }
}



