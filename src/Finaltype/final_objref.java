package Finaltype;
//Practise programs on final variable, method param and object reference
//object referece


public class final_objref {
    final_objref(){

    }
    public static void main(String[] args) {
       final final_objref obj = new final_objref();
      // obj = new final_objref();  // we cannot reassign new object to the final object reference
        System.out.println(obj);

        /*
        final final_objref obj = new final_objref();
        1.  which is constructor here ?final_objref()
        2.  which is object here ?  new final_objref()
        3.  which is object reference here?  obj

         */

    }

}
