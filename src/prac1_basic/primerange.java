package prac1_basic;
/*
Write a program using for loop - Check for Prime Numbers in a Range 1 - 100
1,2,3,5,7,11,13,17
 */
public class primerange {
    public static void main(String[] args) {
        for(int i =1; i<=100; i++){
            int num = i;
            int count = 0;

            for(int j =1; j<=num; j++){
                if(num%j==0) {
                    count++;
                }
            }
            if(count==2) {
                System.out.println(num);
            }
        }
    }

}

/*
1. i = 1 ; 1<=100; num = 1; j=1, 1<=1, 1/1 =0, c =1
2. i =  2; 2<=100; num =2; j=2, 2<=2, 2/2=0, c=2
 */