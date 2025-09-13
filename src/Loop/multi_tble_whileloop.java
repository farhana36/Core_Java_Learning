package Loop;
//while loop : Print a multiplication table from 1 to 10,
//but stop printing entirely when any result is divisible by 7 and greater than 30.
//Use a labeled break.
public class multi_tble_whileloop {
    public static void main(String[] args) {
        int i=1;

        int result;
        abc:
        while(i<=10)
        {
            int j=1;
            while(j<=10)
            {
                result = i*j;
                if(result%7==0 && result>30)
                {
                    break abc;
                }
                System.out.println(i +"*" +j +"="+ result);
                j++;
            }i++;
        }


    }
}
