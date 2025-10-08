package constructor;
/*
Laptop-Class || lenovo,samsung,HP,dell-objects   ---> how to use different name of laptop
 */
public class lenova {
// class declatation
    int SSD, ram,warranty;
    double display;
    // Initialize constructor
    lenova(int SSD, int ram, int warranty, double display){

        this.SSD = SSD;
        this.ram = ram;
        this.warranty = warranty;
        this.display = display;

    }
    //main method
    public static void main(String[] args) {
       lenova laptoplenova =new lenova(512,16,1,15.6);
        System.out.println(laptoplenova.SSD);
        System.out.println(laptoplenova.ram);
        System.out.println(laptoplenova.warranty);
        System.out.println(laptoplenova.display);
    }


}
