package mock;
// Take 3 nos and find the greatest of 3 nos using conditional operator
public class mock_04 {

/*
20 , 10, 5
20 compared with 10 -> 20is grtr  (a>b)? a : b;
20 compare 5 -> 20

 */

    public static void main(String[] args) {
        int a =20;
        int b = 10;
        int c = 5;

        //(conditional)? true : false ;
        int result=(a>b)?a:b;
        int result1= (b>c)?b:c;
        int result2 = (c>a)?c:a;

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }
}
