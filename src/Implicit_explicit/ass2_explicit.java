package Implicit_explicit;
//Write around 3-5 programs on implicit and explicit type casting:
//byte- short/char - int - float - long - double → largest
//Explicit programming
public class ass2_explicit {
    public static void main(String[] args) {
       double i = 5.0;
       int j= (int)i;

       long a = 23;
       byte b =(byte)a;

       float c = 25.0f;
       byte d =(byte)c;

       int e =12;
       short f= (short)e;

        System.out.println(j);
        System.out.println(a);
        System.out.println(c);
        System.out.println(f);


    }
}
