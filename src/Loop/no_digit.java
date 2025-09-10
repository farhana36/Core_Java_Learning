package Loop;
//program to find the number of digits in a given number 14578
public class no_digit {
    public static void main(String[] args) {
        int org_no =14578;
        int digit =0;
        int num = org_no;

        while(num>0)
        {
            if(num%10!=0)
            {
                digit++;
                num = num/10;
            }
        }
        System.out.println(digit);

    }
}
