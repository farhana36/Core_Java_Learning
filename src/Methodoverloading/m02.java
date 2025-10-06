package Methodoverloading;

public class m02 {
    public static void sum (int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void sum(int a, int b){
        System.out.println(a+b);
    }
    public static void sum(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }

    public static void main(String[] args) {
        sum(2,3);
        sum(2,3,4);
        sum(1,2,3,4);
    }

}
