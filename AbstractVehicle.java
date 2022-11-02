/*
* Vehicle Class
*
* @author  Daria Bernice Calitis
* @version 11.0.16
* @since   2022-11-02
*/

/**
 * AbstractVehicle Class.
 */
public abstract class AbstractVehicle {
    /**
     * The current speed of the vehicle.
     */
    private int speed;

    /**
     * Colour of the vehicle.
     */
    private String colour;

    /**
     * The maximum speed of the vehicle.
     */
    private int maxSpeed;

    /**
     * The number of tires.
     */
    private int numTires;

    /**
     * Vehicle constructor.
     *
     * @param colour - the colour
     * @param maxSpeed - the maximum speed of the vehicle
     * @param numTires - the number of tires.
     */
    public AbstractVehicle(
        String colour,
        int maxSpeed,
        int numTires) {
        this.colour = colour;
        this.maxSpeed = maxSpeed;
        this.numTires = numTires;
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
            String.format("%s\n%s\n%s",
                "       --> Speed: " + String.valueOf(this.speed),
                "       --> MaxSpeed: " + String.valueOf(this.maxSpeed),
                "       --> Color: " + this.colour)
        );
    }

    /**
     * The getColor() function.
     *
     * @return colour
     */
    public String getColor() {
        return this.colour;
    }

    /**
     * The setColor() function.
     *
     * @param color - the colour
     */
    public void setColor(String color) {
        this.colour = color;
    }

    /**
     * The getSpeed() function.
     *
     * @return speed
     */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * The setSpeed() function.
     *
     * @param speed - the speed of the vehicle.
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * The getMaxSpeed() function.
     *
     * @return maxSpeed
     */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * The getTires() function.
     *
     * @return numTires - the number of tires.
     */
    public int getTires() {
        return this.numTires;
    }

    /**
     * The accelerate() function.
     *
     * <p>
     * Increases the speed over a period of time.
     * </p>
     *
     * @param accelerationPower - the power
     * @param accelerationTime - the period of time
     */
    public void accelerate(int accelerationPower, int accelerationTime) {
        this.speed = accelerationPower * accelerationTime + this.speed;

        if (this.speed > this.maxSpeed) {
            this.speed = this.maxSpeed;
        }
    }

    /**
     * The break() function.
     *
     * <p>
     * Decreases the speed over a period of time.
     * </p>
     *
     * @param breakPower - the power
     * @param breakTime - the period of time
     */
    public void breakVehicle(int breakPower, int breakTime) {
        this.speed = this.speed - breakPower * breakTime;

        if (this.speed < 0) {
            this.speed = 0;
        }
    }
}
