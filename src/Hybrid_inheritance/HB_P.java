package Hybrid_inheritance;
/* Practise on Hybrid inheritance (comb1)*/
import static Hybrid_inheritance.HB_C1.hbc1;
import static Hybrid_inheritance.HB_C2.hbc2;

public class HB_P {

        public static void  hbP(){
            System.out.println("From hb1 parent class");
        }

        public static void main(String[] args) {
           // hbp();  // daught
            hbc2(); // import required
            hbc1(); // import required
        }
}
