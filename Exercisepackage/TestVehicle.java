import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;

public class TestVehicle {
    public static void main(String[] args) {
        Hero heroBike = new Hero("Hero Splendor", "HR26DK8337", "John Doe", 60);
        Honda hondaBike = new Honda("Honda Shine", "KA03NG1234", "Jane Doe", 80);

        System.out.println("Hero Bike Details:");
        System.out.println("Model Name: " + heroBike.getModelName());
        System.out.println("Registration Number: " + heroBike.getRegistrationNumber());
        System.out.println("Owner Name: " + heroBike.getOwnerName());
        System.out.println("Speed: " + heroBike.getSpeed());
        heroBike.radio();

        System.out.println("\nHonda Bike Details:");
        System.out.println("Model Name: " + hondaBike.getModelName());
        System.out.println("Registration Number: " + hondaBike.getRegistrationNumber());
        System.out.println("Owner Name: " + hondaBike.getOwnerName());
        System.out.println("Speed: " + hondaBike.getSpeed());
        hondaBike.cdplayer();
    }
}
