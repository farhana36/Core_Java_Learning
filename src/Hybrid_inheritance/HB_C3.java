package Hybrid_inheritance;
/* Practise on Hybrid inheritance (comb1)*/
import static Hybrid_inheritance.HB_C1.hbc1;
import static Hybrid_inheritance.HB_C2.hbc2;
import static Hybrid_inheritance.HB_P.hbP;

public class HB_C3 {
    public static void hbc3() {
        System.out.println("From hbc3 child3 class");
    }

    public static void main(String[] args) {
        hbc1(); // import required
        hbc2(); // import required
        hbc3();
        hbP();   //  import required


    }
}