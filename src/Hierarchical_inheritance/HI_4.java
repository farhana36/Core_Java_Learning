package Hierarchical_inheritance;

import static Hierarchical_inheritance.HI_1.h1;
import static Hierarchical_inheritance.HI_2.h2;
import static Hierarchical_inheritance.HI_3.h3;

public class HI_4
{
    public static void h4(){
        System.out.println("parent HI_4 method");
    }

    public static void main(String[] args) {
        h1();  //import required
        h2();  //import required
        h3();  //import required
        h4();
    }

}
