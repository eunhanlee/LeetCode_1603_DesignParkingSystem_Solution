class ParkingSystem2 {
    int[] slots; // An array to store the available slots for each vehicle type.

    /**
     * Creates a parking system with the given sizes of slots for each vehicle type.
     *
     * @param big    Number of slots for large vehicles
     * @param medium Number of slots for medium vehicles
     * @param small  Number of slots for small vehicles
     */
    public ParkingSystem2(int big, int medium, int small) {
        slots = new int[]{big, medium, small};
    }

    /**
     * Adds a vehicle of the given type to the parking system.
     *
     * @param carType The type of the vehicle to be parked (1 for large vehicle, 2 for medium vehicle, 3 for small vehicle)
     * @return true if the vehicle is successfully parked, false otherwise
     */
    public boolean addCar(int carType) {
        return --slots[carType - 1] >= 0;
    }
}
