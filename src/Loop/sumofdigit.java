package Loop;
//Write a program using for loop - Sum of Digits in a Number 153 . Output=9
public class sumofdigit {
    public static void main(String[] args) {

        int n = 153;
        int sum = 0;
        int tn =n;
        int d =n%10;
        //sum = sum + d;
        //System.out.println(sum);
        while(tn>0)
        {
              d=tn%10;
              sum = sum + d; //Remainder extract 3,5,1
              tn=tn/10;     // Remove last digit 3,5,1
        }
        System.out.println(sum);


       /* int number = 153;
        int divisor = 10;
        int sum = 0; // Initialize a variable to store the sum

        // Calculate the remainder
        int remainder = number % divisor;

        // Add the remainder to the sum
        sum = sum + remainder;

        System.out.println("The remainder is: " + remainder);
        System.out.println("The sum with remainder added is: " + sum);

        // Example with a loop to sum digits (using remainders)
        int numToSumDigits = 153;
        int digitSum = 0;
        int tempNum = numToSumDigits; // Use a temporary variable to avoid modifying the original number

        while (tempNum > 0) {

            int digit = tempNum % 10; // Get the last digit (remainder when divided by 10)
            digitSum = digitSum + digit; // Add the digit to the sum  3,
            tempNum = tempNum / 10; // Remove the last digit

        }
        System.out.println("The sum of digits of " + numToSumDigits + " is: " + digitSum);*/

    }
}



