package Loop;
/*
Program: Fizz-Buzz range from 1-50
when the number is divisible by 2 --> print "Fizz"
when the number is divisible by 5 --> print "Buzz"
when the number is divisible by 2 & 5 --> "FizzBuzz"
for remaining number print the "number"
 */
public class FizzBizz {
    public static void main(String[] args) {
        int num =50;
        for(int i =1; i<=num; i++)
        {
            if(i%2==0 && i%5==0){
                System.out.println(i +" FIZZBuzz");
            }
            else if(i%5==0) {
                System.out.println(i +" Buzz");
            }
            else if (i%2==0) {
                System.out.println(i +" Fizz");
                }
            else{
                System.out.println(i);
        }
        }
    }
}
