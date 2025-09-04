package Loop;
//Write a program using for loop - Check for Prime Numbers in a Range 1 - 100
// it is no which divide by itself and >1
public class primeno {
    public static void main(String[] args) {
        int num = 100;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.println(i + " it is prime no");

            } else {
                System.out.println(i + " it is not prime no");
            }


        }
    }
}

