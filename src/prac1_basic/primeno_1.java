package prac1_basic;
/*
To check prime no or not , given no is 7
1,2,3,4,5,6,7
pattern:
1. divide each no with the given no
2. if no is divided by that given no, then it is prime no
3. otherwise no is not prime.
4. rule of prime no, if count is 2 uptil that given no then it is prime (it is divisible by itself, and only 1)

 */
public class primeno_1 {
    public static void main(String[] args) {
        int num =7;
        int count =0;
        for(int i =1; i<=num; i++){
           if(num%i==0)
           {
               count++;
           }
        }
        if(count==2){
            System.out.println("It is prime no");
        }
        else {
            System.out.println("It is not prime no");
        }


    }
}
