package constructor;
// Naveen class concept
public class Const2 {

    int a =10; //Global variable, Non static

    public static void m02(){
        System.out.println("from m02");
    }
    public static void m03(){
        System.out.println("from m03");
    }



    public static void main(String[] args) {
        //new Const2().m02();
        //new Const2().m03();
        //System.out.println(new Const2().a);

        Const2 obj = new Const2();
        System.out.println(obj.a);
        obj.m02();
        obj.m03();
        System.out.println(obj.a);

    }


}
