package breakcase;
//Print a number from 1 to 20, whenever the number is even skip it.
// 1,3,5,7,9.....19
public class printeven_skip {
    public static void main(String[] args) {

        for(int i =1; i<=20; i++)
        {
            if (i%2==0)
            {
                continue;


            }

            System.out.println(i);

        }
        System.out.println("End of the loop");
    }
}
