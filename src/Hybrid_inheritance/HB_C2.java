package Hybrid_inheritance;
/* Practise on Hybrid inheritance (comb1)*/
import static Hybrid_inheritance.HB_C1.hbc1;

/*
Practise of Hybrid inheritence (COMBINATION1)
 */
public class HB_C2 extends HB_P {
    public static void  hbc2(){
        System.out.println("From hb1 child2 class");
    }

    public static void main(String[] args)
    {
        hbc2();
        hbc1(); // import required
        hbP();
    }
}
