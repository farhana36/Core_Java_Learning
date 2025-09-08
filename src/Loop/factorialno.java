package Loop;
//Write a program using for loop - Find Factorial of a Number 5 (taken)
public class factorialno {
    public static void main(String[] args) {
        int fact =1;
        int num = 0;

        if (num==0)
        {
            System.out.println(1);
        }
        else if(num<0)
        {
            System.out.println("num is invalid");
        }
        else {
            for(int i=num; i>=1; i--)
            {
                fact =fact*i;
            }
            System.out.println(fact);
        }

    }
}
