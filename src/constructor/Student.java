package constructor;
//Student|| name,age, id
public class Student {
    String name;
    int age;
    int id;

    Student(String name,int age,int id ){
        this.name = name;
        this.age  = age;
        this.id  = id;
    }

    public static void main(String[] args) {
        Student objStudent = new Student("Gita", 36, 15);
        System.out.println("Student name: " +  objStudent.name);
        System.out.println("Student age: " + objStudent.age);
        System.out.println("Student id: " + objStudent.id);

    }
}
