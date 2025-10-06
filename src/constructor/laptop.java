package constructor;
/*
Laptop-Class || lenovo,samsung,HP,dell-objects   ---> how to use different name of laptop
 */
public class laptop {
// class declatation
    int processor, ram, memory;
    double display;
    // Initialize constructor
    laptop(int processor, int ram, int memory, double display){

        this.processor = processor;
        this.ram = ram;
        this.memory = memory;
        this.display = display;

    }
    //main method
    public static void main(String[] args) {
       laptop laptop1 =new laptop(256,290,16,14);
        System.out.println(laptop1.ram);
        System.out.println(laptop1.memory);
    }


}
