package prac1_basic;
/*
Find the range of prime no from 1 to 50
1,2,3,4,----upto 50
pattern
{
1. Check each no is divisible startng from 1 to 50
}
2. To check prime no one more loop needed
 */
public class primeno_range1 {
    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++)
        {
            int num = i;
            int count =0;
            for (int j = 1; j <= num; j++)
            {
                if(num%j== 0)
                {
                    count++;
                }
            }
            if(count == 2) {
                System.out.println(num);
            }

        }


    }
}
