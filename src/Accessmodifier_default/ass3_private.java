package Accessmodifier_default;

//import static Accessmodifier_private.ass1_private.n01;

/*
"Write a program to demonstrate the private access modifier and validate:
- within same class.
- within different class in same package.
- within different class in different package."---->
 */
public class ass3_private {
    public static void main(String[] args) {
        System.out.println("Main method with diff pack with diff class");
        //n01();
        //n02();
        n03();

    }
    private static void n03(){
        System.out.println("within different class in different package");
    }


}
