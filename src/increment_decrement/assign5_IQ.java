package increment_decrement;
/*
int i=19, j=29, k;

        k = i-- - i++ + --j - ++j + --i - j-- + ++i - j++;

        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("k="+k);
 */
public class assign5_IQ {
    public static void main(String[] args) {
        int i =19;
        int j=29;
        int k;

        // i=18  i=19   j=28  j=29   i=18  j=28 i=19 j=29
        k = i-- - i++ + --j - ++j + --i - j-- + ++i - j++;
       //   19   - 18  + 28 - 29  +  18  - 29  + 19 - 28
       //   19 -29 -29 +19  =38-58=-20
        System.out.println("i="+i);  //19
        System.out.println("j="+j);  //29
        System.out.println("k="+k);  //-20


    }
}
