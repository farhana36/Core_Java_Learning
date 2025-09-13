package Loop;
//Program to find the no of digit in a number 14578
public class noofdigit {
    public static void main(String[] args) {
        int num=14578;
        int count =0;
        while (num>0)
        {
            count ++;
            num=num/10;
        }
        System.out.print(count);
    }
}

/*  int orgno=14578;
        int count =0;
        int num=orgno;

        while (num>0)
        {
            if(num%10!=0)
                count ++;
            num=num/10;

        }
        System.out.print(count);*/
