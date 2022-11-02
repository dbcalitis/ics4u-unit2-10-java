/*
* Bicycle Class
*
* @author  Daria Bernice Calitis
* @version 11.0.16
* @since   2022-10-18
*/

/**
 * Bicycle Class.
 */
public class Bicycle extends AbstractVehicle {
    /**
     * Cadence field.
     */
    private int cadence;

    /**
     * Bicycle constructor.
     *
     * @param colour - the colour
     * @param maxSpeed - the maximum speed of the vehicle
     * @param numTires - the number of tires.
     */
    public Bicycle(
        String colour,
        int maxSpeed,
        int numTires) {
        super(colour, maxSpeed, numTires);
    }

    /**
     * The status() function.
     *
     * <p>
     * Shows the status and properties of the vehicle
     * </p>
     */
    public void status() {
        System.out.println(
            String.format("%s\n%s\n%s\n%s\n%s",
                "       --> Speed: " + String.valueOf(super.getSpeed()),
                "       --> MaxSpeed: " + String.valueOf(super.getMaxSpeed()),
                "       --> Color: " + super.getColor(),
                "       --> Cadence: " + this.cadence,
                "       --> Number of tires: " + super.getTires())
        );
    }

    /**
     * The getCadence() function.
     *
     * <p>
     * Returns the value of the cadence.
     * </p>
     *
     * @return cadence - the value of the cadence.
     */
    public int getCadence() {
        return this.cadence;
    }

    /**
     * The accelerate() function.
     *
     * <p>
     * Increases the cadence and the speed of the bike
     * </p>
     *
     * @param appliedPower - the appliedPower to the bike.
     */
    public void accelerate(int appliedPower) {
        this.cadence = this.cadence + appliedPower;
        super.setSpeed(this.cadence * 2);
    }

    /**
     * The ringBell() function.
     *
     * <p>
     * Prints out the sound of the bell.
     * </p>
     */
    public void ringBell() {
        System.out.println("Ding Ding!\n");
    }

}
