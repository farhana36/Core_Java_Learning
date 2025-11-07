package mock;

public class mock_03 {
    // programme to find no of digits in a given no 5672309
    public static void main(String[] args) {
        /* pattern
        1. 5672309
        2. num = 0
        3. count = 7
         */

        int num = 5672309;
        int count = 0;

        while(num>0){
            count ++;
            num = num/10;
        }
        System.out.println(count);
    }

}
