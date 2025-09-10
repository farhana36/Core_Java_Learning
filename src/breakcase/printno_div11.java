package breakcase;
//Print a number from 1 to 20, whenever the number is divisible by 11 then stop printing
public class printno_div11 {
    public static void main(String[] args) {

        for(int i =1; i<=20; i++)
        {
            if(i%11==0)
            {
                break;
            }
            System.out.println(i);
        }
    }
}
