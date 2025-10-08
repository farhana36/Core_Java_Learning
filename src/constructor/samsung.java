package constructor;
//laptop-samsung
public class samsung {
    int SSD,ram, warranty;
    double display;

    samsung (int SSD, int ram, int warranty, double display){
        this.SSD =SSD;
        this.ram = ram;
        this.warranty=warranty;
        this.display = display;

    }

    public static void main(String[] args) {
       samsung laptopsamsung = new samsung(512, 8, 2, 15.6);
        System.out.println(laptopsamsung.SSD);
        System.out.println(laptopsamsung.ram);
        System.out.println(laptopsamsung.warranty);
        System.out.println(laptopsamsung.display);
    }
}
