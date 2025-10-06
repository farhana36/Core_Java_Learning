package constructor;

import javax.imageio.stream.ImageInputStream;

/*transport-class || roadway,waterways,air  --> Bus,ship, plane
 */
public class transport {
    String roadway;
    String waterway;
    String airway;

    transport(String roadway,String waterway,String airway){
        this.roadway = roadway;
        this.waterway = waterway;
        this.airway = airway;


    }

    public static void main(String[] args) {
        transport objtrans=new transport("Bus", "Ship", "Plane");
        System.out.println("Roadway: " + objtrans.roadway);
        System.out.println("waterway: " + objtrans.waterway);
        System.out.println("airway: " + objtrans.airway);
    }

}
