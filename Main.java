/*
* This is the standard Main() class starting point.
*
* @author  Daria Bernice Calitis
* @version 11.0.16
* @since   2022-10-25
*/

/**
 *  Main class.
*/
final class Main {
    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException.
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */
    public static void main(final String[] args) {
        final Bicycle bmx = new Bicycle("Red", 40, 2);

        System.out.println("Created Bmx bike.\nStatus:\n");
        bmx.status();

        System.out.println("Set the cadense to 10\n");
        bmx.accelerate(10);
        bmx.status();

        System.out.println("\nAccelerate by 15:");
        bmx.accelerate(15);
        bmx.status();

        System.out.println("\nRing bell.");
        bmx.ringBell();

        final Truck bigTruck = new Truck("Grey", "HGC-23456F", 200, 4);

        System.out.println("Created a Truck.\nStatus\n");
        bigTruck.status();

        System.out.println("\nAccelerating, 10 of power for ten seconds:");
        bigTruck.accelerate(10, 10);
        System.out.println("New speed: " + String.valueOf(bigTruck.getSpeed()));

        System.out.println("\nBreaking, 10 of power for 10 sec.");
        bigTruck.accelerate(10, 10);
        System.out.println("New speed: " + String.valueOf(bigTruck.getSpeed()));

        System.out.println("\nApplyed air pressure of 10, power of 10 for 10 sec:");
        bigTruck.breakVehicle(10, 10, 10);
        System.out.println("New speed: " + String.valueOf(bigTruck.getSpeed()));

        System.out.println("\nDone.");
    }
}
