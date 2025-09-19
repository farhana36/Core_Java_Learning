package increment_decrement;
/*
Print the value of a
int a=1;
a = a++ + ++a * --a - a--;
 */
public class assgn2 {
    public static void main(String[] args) {
        int a =1;
        //     a=2,   a=3,    a=2,  a=1
        int a1 = a++ + ++a * --a - a--;
        //       1   +   3 *  2  -  2
        //        1  +    6   -2  = 7-2 =5
        System.out.println(a1);

        //int b1= a--;
        //System.out.println(b1);

    }


}

