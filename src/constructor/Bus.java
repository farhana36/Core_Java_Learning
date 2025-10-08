package constructor;
//transport-class || roadway,waterways,air
public class Bus {
    int stops;
    int seats;
    int driver;

    public static void run(){
        System.out.println("Bus is running at high speed");
    }

    Bus(int stops,int seats,int driver){
        this.stops = stops;
        this.seats = seats;
        this.driver = driver;
    }

    public static void main(String[] args) {
        Bus objBus = new Bus(5,50,1);
        System.out.println("Bus have 5 stops :" + objBus.stops);
        System.out.println("Bus have 50 seats :" + objBus.seats);
        System.out.println("Bus have 1 driver :" + objBus.driver);

        run();

    }
}

