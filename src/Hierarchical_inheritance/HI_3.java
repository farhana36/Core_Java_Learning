package Hierarchical_inheritance;

import static Hierarchical_inheritance.HI_1.h1;
import static Hierarchical_inheritance.HI_2.h2;

public class HI_3  extends HI_4{
    public static void h3(){
        System.out.println("parent HI_3 method");
    }

    public static void main(String[] args) {
        h1();  //import required
        h2(); // import required
        h3();
        h4();
    }
}
