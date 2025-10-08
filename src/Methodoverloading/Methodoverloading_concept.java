package Methodoverloading;
//concept  --> no output shown doubt
public class Methodoverloading_concept {

    public static void m01(){
        System.out.println("from method m01");

    }
    public static void mo1(int a){
        System.out.println("from method m01 with int a as param");
    }
    public static void m01(double b, int a){
        System.out.println("from method m01 with double b and int a as two param");
    }

    public static void main(String[] args) {
            m01();
    }
}
