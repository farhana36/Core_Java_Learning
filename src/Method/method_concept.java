package Method;
//Method concept using no of digit program 1457890
public class method_concept {
    public static void main(String[] args) {
        System.out.println("Program started");
        int num = 1457890;
        int count = 0;
        noofdigit(num, count); //calling function noofdigit()

        System.out.println("Program finished");
    }

    public static void noofdigit(int num, int count) {
        while (num > 0) {
            count++;
            num = num / 10;

        }
        System.out.println(count);

    }

}


