package condition;

public class elseifladder {
    public static void main(String[] args) {
    /*print no even  1 to 20  divisible by 2 print no along with @
print no even  1 to 20  divisible by 3 print no along with $
print no even  1 to 20  divisible by 5 print no along with *
 using if else lader condition/*
      */
        for (int i=1; i<=20; i++)
        {
            if (i%2==0)  // divisible by 2
            {
                System.out.println(i+"@");
            }
            else if (i%3==0)   // divisible by 3
            {
                System.out.println(i + "$" );

            }
            else if(i%5==0) //divisible by 5
            {
                System.out.println(i + "*");
            }
        }
        System.out.println("End of else if ladder");
    }
}
