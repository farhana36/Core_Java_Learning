package constructor;

/*
Animal-Class || lion,dog,cat-objects.
 */
//class
public class animal {
    String lion = "lion";
    String dog =  "dog";
    String cat = "cat";

     //constructor

     animal(String lion, String dog, String cat){
         this.lion = lion;
         this.dog = dog;
         this.cat = cat;

     }

    public static void main(String[] args) {
         animal animal1= new animal("Roar",  "bark",   "meow");
        System.out.println("Lion sound :" + animal1.lion);
        System.out.println("Dog sound : " + animal1.dog);
        System.out.println("Cat sound :" + animal1.cat);
    }



}
