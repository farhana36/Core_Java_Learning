package Loop;
//Write a program using for loop - Check for Prime Numbers in a Range 1 - 100
// it is no which divisible by itself and 1
public class primeno {
    public static void main(String[] args) {

        for (int num =1; num<=100; num++ )
        {
            int count =0;

            for (int i = 1; i <= num; i++)
            {
                if (num % i == 0) {

                    count++;
                }

            }
            if(count==2){
                System.out.println(num);
            }
        }





    }
}

/*
int count = 0;
         int num = 10;
         int i=1;
         while(i<=num)
         {
             if(i%num==1)
             {
                 count++;
             }
         }
        System.out.println(i);
 */