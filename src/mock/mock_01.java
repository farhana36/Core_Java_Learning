package mock;
/*
int x = 5;
x = x++ + ++x;
System.out.println(x);
 */
public class mock_01 {
    public static void main(String[] args) {
        int x = 5;
        x = x++ + ++x;
        //  6  + 6
        System.out.println(x);
    }
}
