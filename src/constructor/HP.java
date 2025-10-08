package constructor;
//HP -OBJECT
public class HP {
    int SSD,ram, warranty;
    double display;

    HP (int SSD, int ram, int warranty, double display){
        this.SSD =SSD;
        this.ram = ram;
        this.warranty=warranty;
        this.display = display;

    }

    public static void main(String[] args) {
        HP laptopHP = new HP(512, 16, 1, 15.6);
        System.out.println(laptopHP.SSD);
        System.out.println(laptopHP.ram);
        System.out.println(laptopHP.warranty);
        System.out.println(laptopHP.display);
    }
}
