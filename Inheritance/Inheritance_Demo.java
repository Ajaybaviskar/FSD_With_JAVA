
class Bicycle {
    protected int gear;
    protected int speed;

    public Bicycle(int startSpeed, int startGear) {
        gear = startGear;
        speed = startSpeed;
    }

    public void setGear(int newValue) {
        gear = newValue;

    }

    public void applyBreak(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;

    }
}

class MountainBike extends Bicycle {
    public int seatHeight;

    public MountainBike(int startHeight, int setGear, int startSpeed) {
        super(startSpeed, setGear);
        // this is your first statement in constructor other wise not work
        this.seatHeight = startHeight;
        // this represent the current object property and here override startHeight
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
}

public class Inheritance_Demo {
    public static void main(String args[]) {
        MountainBike mb = new MountainBike(140, 1, 20);
        System.out.println("Bike Seat Height is : " + mb.seatHeight + "mm");
        System.out.println("Bike Gear is : " + mb.gear);
        System.out.println("Bike Speed is : " + mb.speed);

        mb.applyBreak(1);
        System.out.println("After Applying the Break Speed is : " + mb.speed);

    }

}