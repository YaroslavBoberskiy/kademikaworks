/**
 * Created by YB on 27.10.2015.
 */
public class Tank {

    private Color color;
    private int crew;
    private int maxSpeed;

    Tank () {
        color = Color.BLACK;
        crew = 1;
        maxSpeed = 20;
    }

    public void move(Tank t) {
        System.out.println("Tank " + t.getClass().getName() + " is moving");
    }

    public void direction(Tank t) {
        System.out.println("Tank " + t.getClass().getName() + " has changer direction");
    }

    public void printTankInfo (Tank t) {
        System.out.println("Tank " + t.getClass().getName() + ", color - " + t.color + ", crew - "
                + t.crew + ", max speed - " + t.maxSpeed);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getCrew() {
        return crew;
    }

    public void setCrew(int crew) {
        this.crew = crew;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
