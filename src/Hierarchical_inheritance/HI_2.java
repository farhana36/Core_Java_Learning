package Hierarchical_inheritance;

import static Hierarchical_inheritance.HI_1.h1;

public class HI_2 extends HI_3 {
    public static void h2(){
        System.out.println("parent HI_2 method");
    }

    public static void main(String[] args) {
        h1();  //import required
        h2();
        h3();
        h4();
    }
}
