package MultipleInheritance;
/*
MULTIPLE INHERITANCE 2 combination
 */
import static MultipleInheritance.MI_P1.m01;

public class MI_C  implements MI_P2,MI_P3{

    static void m02(){
        System.out.println("child implements parent2");
    }

    public static void main(String[] args) {
        m02();
        m01();  // import is necessary to implement

    }
}
