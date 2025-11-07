package prac1_basic;
/*
//Write a program using for loop - Sum of Digits in a Number 153 . Output=9
pattern:
sum = 1 + 5 + 3 = 9

new pattern:
find each number
add each number with each other
print the result
---------------------------
1. find the last digit using %10
2. sum it with the last digit
3. update the number by /10
4. repeat line number 1,2,3 until the num is 0
 */
public class sumofno {
    public static void main(String[] args) {
        int num = 153;
        int sum =0;

        while(num>0)
        {
            int lastnum = num%10;
            sum = sum + lastnum;
            num = num/10;
        }
       /* int num = 153;
        int sum = 0;

        while(num>0) //repeat line number 1,2,3 until the num is 0
        {
            int eachdigit = num%10;//find the last digit using %10
            sum = sum + eachdigit;  //sum it with the last digit

             num = num/10; //update the number by /10
    }
        */
        System.out.println(sum); //sum will hold the sum of all the digit present in number.



    }

}
