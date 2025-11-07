package prac1_basic;
/*
//Write a program to check the no prime or not take no as 4
// it is no which divisible by itself and 1
 pattern
 1.

 */
public class primeno {
    public static void main(String[] args) {

            int num = 10;
            int count = 0;

            for(int i =1; i<=num; i++){
                if(num%i==0) {
                    count++;
                }

            }
            if(count==2){
                System.out.println("The no is prime");
            }
            else{
            System.out.println("The no is not prime");
        }

    }

}
