package Implicit_explicit;
//Write around 3-5 programs on implicit and explicit type casting:
//byte- short/char - int - float - long - double → largest
//implicit programming

public class ass1_imp {
    public static void main(String[] args) {
        byte b =10;
        int a =b;
        int c = 15;
        double d=c;
        float e= 20.0f;
        double f = e;
        byte g= 25;
        short h=g;

        System.out.println(a);
        System.out.println(c);
        System.out.println(e);
        System.out.println(h);
    }


}
