//write a programme to check the no is Armstrong 153
// 1.find the no of digit = 3
// 2. Armstrong logic = 1*1*1+5*5*5+3*3*3 = 153

public class armstrongno {
    public static void main(String[] args) {
        int original_no =153;
        int digit =0;//initilization

        int num =  original_no;
        while(num>0)  //condition153,15,1
        {
            if (num%10!=0)//15,1,0
                digit++;//UPDATION 1,2
            num=num/10;//3,5,1
        }
        System.out.println(digit);
// 2. Armstrong logic = 1*1*1+5*5*5+3*3*3 = 153
        int result = 0;
        int num1=original_no;
        while (num1>0)
        {
            int eachdigit = num1%10;//15,
            result = result + (int)Math.pow(eachdigit,digit);
            num1=num1/10;
        }
        System.out.println(result);
//3. comparison result with original no
      if(original_no ==result)
      {
          System.out.println("The no is Armstrong");
      }
      else
      {
          System.out.println("The no is not Armstrong");
      }



    }
}
