package increment_decrement;

public class incr_decr_concept {
    public static void main(String[] args) {
        int i =12;
                         // 11    10    11   12
        System.out.println(i-- + --i - ++i + i++);
                         //12  +  10  - 11  + 11
    }
}
