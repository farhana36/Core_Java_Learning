package Method;
// method using sum of digit programme
public class method_sumofdigit {
    public static void main(String[] args) {
        System.out.println("Program started");
        int num = 153;
        int sum = 0;
        sumofdigit(num, sum);
        System.out.println("Program finished");


    }

    public static void sumofdigit(int num, int sum){
        while (num > 0)//153
        {
            int eachdigit = num % 10; // last digit assigning to eachdigit//0
            sum = sum + eachdigit;//
            num = num / 10; // updating the value of num//1
        }
        System.out.println(sum);


    }
}

