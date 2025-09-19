package conditional_operator;
//Take 3 numbers and find the greatest number using conditional operator
public class assg2 {
    public static void main(String[] args) {
        int a =15;
        int b =10;
        int c = 5;
        int result=(a>b)?a:b;
        int result1=(b>c)?b:c;
        int result2 = (a>c)?a:c;
        System.out.println(result); //15
        System.out.println(result1); //10
        System.out.println(result2);  //15

    }
}
