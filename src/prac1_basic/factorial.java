package prac1_basic;
/*
Write a program using for loop - Find Factorial of a Number ? num=5
5! = 5 * 4 * 3 * 2 *1 = 120
pattern
1. decreasing each no 1 starting from 5
2. multiplication to the result
 */
public class factorial {
    public static void main(String[] args) {
        int fact = 1;
        int num = 5;
        for(int i =1; i<=num; i++){
            fact = fact*i;
        }
        System.out.println(fact);

    }
}
// fact = 1; i =1
// fact = 1*2 ; i=2
// fact = 2*3 ; i =3
//fact = 6 * 4; i=4
// fact = 24*5 ; i=5