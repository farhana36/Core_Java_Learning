package constructor;
//Animal-Class || lion,dog,cat-objects.
public class lion {
    int eyes;
    int tail;
    int legs;

    public static void walk(){
        System.out.println("Lion walk");
    }
    public static void talk(){
        System.out.println("Lion roar");
    }


    lion(int eyes,int tail,int legs ){
        this.eyes = eyes;
        this.tail=tail;
        this.legs = legs;
    }

    public static void main(String[] args) {
        lion objlion = new lion(2,1,2);
        System.out.println(" lion have two eyes :" +objlion.eyes );
        System.out.println(" lion have one tail :" +objlion.tail );
        System.out.println(" lion have two legs :" +objlion.legs );
        objlion.walk();
        objlion.talk();
    }
}
