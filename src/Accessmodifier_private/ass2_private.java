package Accessmodifier_private;

//import static Accessmodifier_private.ass1_private.n01;
/*
"Write a program to demonstrate the private access modifier and validate:
- within same class.
- within different class in same package.--->
- within different class in different package."
 */
public class ass2_private {
    public static void main(String[] args) {
        System.out.println(" Main within different class in same package");
    }
    private void n02(){
        System.out.println("within different class in same package");
        //n01();
    }
}
