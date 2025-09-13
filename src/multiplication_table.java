//for loop : Print a multiplication table from 1 to 10,
// but stop printing entirely when any result is divisible by 7 and greater than 30.
// Use a labeled break.

public class multiplication_table {
    public static void main(String[] args) {
        int result ;

        abc:
        for(int i=1; i<=10; i++)
        {
            for(int j=1; j<=10; j++)
            {
                result = i*j;

                //System.out.println(result);
                if (result%7==0  && result>30)
                {
                    break abc;
                }
                System.out.println(i + "*" + j + "="   +  result);
            }

        }

    }
}
//1*1=1   i=1(o)   1*1=1
//1*2=2
//1*3=3
//1*4=4
//1*5=5

//2*1=2
//2*2=4
//2*3=6
//2*4=8
//2*5=10


