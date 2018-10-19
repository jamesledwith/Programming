package com.jamesl;

public class Car extends Vehicle {
    private int wheels;
    private int door;
    private int gears;
    private boolean isManual;

    private int currentGear;
    private int currentVelocity;

    public Car(String name, String colour, int wheels, int door, int gears, boolean isManual,int currentVelocity) {
        super(name, colour);
        this.wheels = wheels;
        this.door = door;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
        this.currentVelocity = 0;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction){
        moving(speed, direction);
        System.out.println("Car.changeVelocity(): Speed " + speed + " direction " + direction);
    }

    public void stop(int speed){
        this.setSpeed(0);
    }
}
