/**
 * Represents a parking system that manages available slots for different car types.
 */
class ParkingSystem {
    private int bigSlots;      // Number of available slots for big cars
    private int mediumSlots;   // Number of available slots for medium cars
    private int smallSlots;    // Number of available slots for small cars

    /**
     * Constructs a new ParkingSystem with the specified number of slots for each car type.
     *
     * @param big    the number of slots available for big cars
     * @param medium the number of slots available for medium cars
     * @param small  the number of slots available for small cars
     */
    public ParkingSystem(int big, int medium, int small) {
        this.bigSlots = big;
        this.mediumSlots = medium;
        this.smallSlots = small;
    }

    /**
     * Attempts to add a car of the given type to the parking system.
     *
     * @param carType the type of car to be parked (1 for big car, 2 for medium car, 3 for small car)
     * @return true if the car is successfully parked, false otherwise
     */
    public boolean addCar(int carType) {
        switch (carType) {
            case 1: // Big car
                if (this.bigSlots > 0) {     // Check if there are available slots for big cars
                    this.bigSlots--;        // Decrement the count of available big car slots
                    return true;            // Car parked successfully
                }
                break;
            case 2: // Medium car
                if (this.mediumSlots > 0) {  // Check if there are available slots for medium cars
                    this.mediumSlots--;     // Decrement the count of available medium car slots
                    return true;            // Car parked successfully
                }
                break;
            case 3: // Small car
                if (this.smallSlots > 0) {   // Check if there are available slots for small cars
                    this.smallSlots--;      // Decrement the count of available small car slots
                    return true;            // Car parked successfully
                }
                break;
            // Since the constraints state that carType is 1, 2, or 3 only,
            // this default case is not needed. The switch statement will cover all possible cases.

            // default:
            //     throw new IllegalArgumentException("Invalid car type: " + carType);
        }
        return false;   // No available parking slot for the given car type
    }
}
