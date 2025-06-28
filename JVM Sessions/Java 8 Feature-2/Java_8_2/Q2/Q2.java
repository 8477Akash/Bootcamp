package Java_8_2.Q2;
interface Vehicle {

    default void start() {
        System.out.println("Starting the vehicle...");
        System.out.println("\n\n");
    }

    static void showType() {
        System.out.println("Vehicles can be bikes, cars, trucks, etc.");
        System.out.println("\n\n");
    }
}
class Bike implements Vehicle {
}
class InterfaceExample {
    public static void Demo() {
        Bike myBike = new Bike();
        myBike.start();
        Vehicle.showType();
    }
}
public class Q2 {
    public static void main(String[] args) {
        InterfaceExample.Demo();
    }
}
