package Hybrid_inheritance;
/* Practise on Hybrid inheritance (comb1)*/
import static Hybrid_inheritance.HB_C2.hbc2;

public class HB_C1 extends HB_P {

        public static void  hbc1(){
            System.out.println("From hb1 child1 class");
        }

        public static void main(String[] args) {
            hbc1();
            hbc2(); // import required
            hbP();

        }
}
