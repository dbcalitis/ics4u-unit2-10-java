/*
* Truck Class
*
* @author  Daria Bernice Calitis
* @version 11.0.16
* @since   2022-10-25
*/

/**
 * Truck Class.
 */
public class Truck extends AbstractVehicle {
    /**
     * License Plate.
     */
    private String licensePlate;

    /**
     * Vehicle constructor.
     *
     * @param colour - the colour
     * @param licensePlate - the license Plate
     * @param maxSpeed - the maximum speed of the vehicle
     * @param numTires - the number of tires.
     */
    public Truck(
        String colour,
        String licensePlate,
        int maxSpeed,
        int numTires) {
        super(colour, maxSpeed, numTires);
        this.licensePlate = licensePlate;
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
                "       --> License Plate: " + this.licensePlate,
                "       --> Color: " + super.getColor(),
                "       --> Number of tires: " + super.getTires())
        );
    }

    /**
     * The getLicense() function.
     *
     * @return licensePlate
     */
    public String getLicensePlate() {
        return this.licensePlate;
    }

    /**
     * The setLicensePlate() function.
     *
     * @param licensePlate - The license plate
     */
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    /**
     * The breakVehicle() function.
     *
     * @param airPressure - the air pressure.
     * @param breakPower - the break power.
     * @param breakTime - the break time.
     */
    public void breakVehicle(int breakPower, int breakTime, int airPressure) {
        super.setSpeed(super.getSpeed() - (
            breakPower * breakTime) - (airPressure * breakTime));

        if (super.getSpeed() < 0) {
            super.setSpeed(0);
        }
    }
}
