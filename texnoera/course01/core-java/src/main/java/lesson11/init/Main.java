package lesson11.init;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Creating a Vehicle...");
        Vehicle vehicle = new Vehicle("Generic Vehicle");

        System.out.println("\nSTART: Creating a Car -----> 1");
        Car car1 = new Car("Toyota", 4);
        System.out.println("END: Creating a Car -----> 1");

        System.out.println("\nCreating a Car -----> 2");
        Car car2 = new Car("Toyota", 4);
        System.out.println("END: Creating a Car -----> 2");

        System.out.println("\nCreating a Car -----> 3");
        Class<?> aClass = Class.forName("lesson11.init.Car");
        System.out.println("\nCreating a Car -----> 3");



        System.out.println("\nStarting the Vehicle...");
        vehicle.start();

        System.out.println("Starting the Car...");
        car1.start();
        car2.start();

        System.out.println("\nTotal Vehicles created: " + Vehicle.vehicleCount);
        System.out.println("Total Cars created: " + Car.carCount);
    }
}