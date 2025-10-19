package Encapsulation;

import org.w3c.dom.ls.LSOutput;

public class ex2  extends ex1{
    public static void main(String[] args) {
        ex2 obj = new ex2();
        obj.setName("John");
        obj.setMarks(100);
        obj.setRollno(20);
        obj.setGrade('A');

        System.out.println(obj.getName());
        System.out.println(obj.getMarks());
        System.out.println(obj.getRollno());
        System.out.println(obj.getGrade());

    }




}



