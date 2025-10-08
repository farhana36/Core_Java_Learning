package constructor;
/*
Write a program which has 3 features
 legs, tail, eyes.
Also it has some actions : walk, run   ---> how to use actions
 Create a object of it and initilaize the values

 */
//1. class declaration
public class tiger {
    int legs =2;
    int tail =1;
    int eyes =2;

    // 2. constructor declaration
    public tiger (int legs, int tail, int eyes){
        this.legs = legs;
        this.tail = tail;

        this.eyes = eyes;

    }
    //3. method, uses the value used in the constructor

   public static void walk (){
        System.out.println("Tiger waking in jungle");
    }

    public static void run (){
        System.out.println("Tiger is running to catch hunter");
    }

    //4.  main method to start the program and use the object
    public static void main(String[] args) {
            tiger  objtiger= new tiger(2,1,2);
            System.out.println("Tiger have 2 legs :" + objtiger.legs);
            System.out.println("Tiger have 1 tail :" + objtiger.tail);
            System.out.println("Tiger have 2 eyes :" + objtiger.eyes);

            walk();
            run();




    }


}
