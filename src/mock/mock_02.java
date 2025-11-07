package mock;

public class mock_02 {

    static int increment(int x)
    {
        return ++x; //8
    }

    public static void main(String[] args) {
        int a = 5; //
        a = increment(a++) + increment(++a);
        //a = 6 + 8
        //a= 7
        System.out.println(a);
    }
}
