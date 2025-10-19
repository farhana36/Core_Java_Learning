package Encapsulation;
/*Write a program to demonstrate the concept of Encapsulation:
make 4 members as private.
create a getter and setter methods for all private member.
update the implementations and use it in other class.*/
public class ex1 {
    private String name;
    private int rollno;
    private int marks;
    private char grade;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public int setMarks(int marks) {
        return marks;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        ex1 obj=new ex1();

        System.out.println("Student :" +obj.name);
        System.out.println("Marks :" + obj.marks);
        System.out.println("Roll no :" + obj.rollno);
        System.out.println("Grade :"  + obj.grade);

        System.out.println(new ex1().name);
        System.out.println(new ex1().marks);
        System.out.println(new ex1().rollno);
        System.out.println(new ex1().grade);


    }



}
