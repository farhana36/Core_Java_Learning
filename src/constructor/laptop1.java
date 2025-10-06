package constructor;
/*
Laptop-Class || lenovo,samsung,HP,dell-objects   ---> which parameters of laptop to be taken in main method
 */
public class laptop1 {
    String Lenova;
    String samsung;
    String HP;
    String dell;

    laptop1(String Lenova,String samsung,String HP,String dell){
        this.Lenova = Lenova;
        this.samsung = samsung;
        this.HP = HP;
        this.dell = dell;

    }

    public static void main(String[] args) {
        laptop1 objlaptop1= new laptop1("chinese", "korea", "california", "american");
        System.out.println("Lenova mfg country :"  + objlaptop1.Lenova);
        System.out.println("samsung mfg country :" + objlaptop1.samsung);
        System.out.println("HP mfg country :"  + objlaptop1.HP);
        System.out.println("dell mfg country :" +  objlaptop1.dell);

    }
}
