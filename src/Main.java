public class Main {
    public static void main(String[] args) {
        // Create a ParkingSystem with 1 big slot, 2 medium slots, and 3 small slots
        ParkingSystem2 parkingSystem = new ParkingSystem2(1, 2, 3);

        System.out.println(parkingSystem.addCar(1));  // Output: true (parked a big car) 0
        System.out.println(parkingSystem.addCar(2));  // Output: true (parked a medium car) 1
        System.out.println(parkingSystem.addCar(3));  // Output: true (parked a small car) 2

        System.out.println("==============================");
        System.out.println(parkingSystem.addCar(1));  // Output: false (no available big slots) -1
        System.out.println(parkingSystem.addCar(2));  // Output: true (available medium slots) 0
        System.out.println(parkingSystem.addCar(3));  // Output: true (available small slots) 1

        System.out.println("==============================");
        System.out.println(parkingSystem.addCar(1));  // Output: false (no available big slots) -2
        System.out.println(parkingSystem.addCar(2));  // Output: false (available medium slots) -1
        System.out.println(parkingSystem.addCar(3));  // Output: true (available small slots) 0

        System.out.println("==============================");
        System.out.println(parkingSystem.addCar(1));  // Output: false (no available big slots) -3
        System.out.println(parkingSystem.addCar(2));  // Output: false (available medium slots) -2
        System.out.println(parkingSystem.addCar(3));  // Output: false (available small slots) -1


    }
}
