package Finaltype;
//Practise programs on final variable, method param and object reference
//method param
public class final_methodparam {

    public static void m01(final int m){
        System.out.println(m);
        //System.out.println(++m);  //we cannot upgrade the value of final parameter because of final word
    }
    public static void main(String[] args) {
        m01(5);
    }
}
