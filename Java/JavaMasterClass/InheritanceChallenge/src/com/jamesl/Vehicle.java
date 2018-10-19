package com.jamesl;

public class Vehicle {
    private int currentSpeed;
    private String name;
    private String colour;
    private int currentDirection;

    public Vehicle( String name, String colour) {
        this.name = name;
        this.colour = colour;
        this.currentDirection = 0;
        this.currentSpeed = 0;
    }

    public void handSteering(char direction){
        this.currentDirection += direction;
        System.out.println("handSteering(): Steering at: " + currentDirection + " degrees");
    }
    public void moving(int velocity, int direction){
        this.currentSpeed = velocity;
        this.currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + currentSpeed + " in direction " + currentDirection);
    }

    public int getSpeed() {
        return currentSpeed;
    }

    public void setSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getDirectionFacing() {
        return currentDirection;
    }

    public void setDirectionFacing(int currentDirection) {
        this.currentDirection = currentDirection;
    }


}
