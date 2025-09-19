package Loop;
//Write a program using for loop - Sum of Digits in a Number 153 . Output=9
public class sumofdigit {
    public static void main(String[] args) {

       int num =153;
       int sum =0;
       while(num>0)//153
       {
          int eachdigit=num%10; // last digit assigning to eachdigit//0

           sum = sum + eachdigit;//
           num=num/10; // updating the value of num//1

       }
        System.out.println(sum);





    }
}



