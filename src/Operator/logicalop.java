package Operator;
/*
Write a program to practise on Logical AND , OR and NOT operator
 */
public class logicalop {
    public static void main(String[] args) {
        int a =5;
        double b = 2.5;
        int c = 2;

        // AND operator
        if(a>b && a>c){
            System.out.println("a is greatest");
        }
        else{
            System.out.println(" a is smallest");
        }

        // OR operator
        if (b>a || b<c ){
            System.out.println("b is greatest");
        }
        else{
            System.out.println("b is smallest");
        }

        // NOT operator
        if(!false){
            System.out.println("it is true");
        }


    }

}
