package constructor;
/*
Write a program which has 3 features
 legs, tail, eyes.
Also it has some actions : walk, run   ---> how to use actions
 Create a object of it and initilaize the values
 tiger obj = new tiger();
 int    a   =  8;
 */
//1. class declaration
public class tiger {
    int legs =2;
    int tail =1;
    int eyes =2;
    //string walk;
    //string run ;
    // 2. constructor declaration
    public tiger (int legs, int tail, int eyes){
        this.legs = legs;
        this.tail = tail;
        this.eyes = eyes;
        //this.walk = walk;
        //this.run = run;
    }
    //3. method, uses the value used in the constructor

    void m01 (){
        System.out.println("Hellow Tiger");
    }

    //4.  main method to start the program and use the object
    public static void main(String[] args) {
            tiger  tiger1= new tiger(2,1,2);

            tiger1.m01();
           // tiger1.eyes;
           // tiger1.legs;
           // tiger1.tail;


    }


}
