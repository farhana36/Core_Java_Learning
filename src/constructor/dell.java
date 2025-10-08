package constructor;
//dell object
public class dell {

    int SSD,ram, warranty;
    double display;

    dell (int SSD, int ram, int warranty, double display){
        this.SSD =SSD;
        this.ram = ram;
        this.warranty=warranty;
        this.display = display;

    }

    public static void main(String[] args) {
        dell laptopdell = new dell(512, 16, 1, 15.6);
        System.out.println(laptopdell.SSD);
        System.out.println(laptopdell.ram);
        System.out.println(laptopdell.warranty);
        System.out.println(laptopdell.display);
    }
}
