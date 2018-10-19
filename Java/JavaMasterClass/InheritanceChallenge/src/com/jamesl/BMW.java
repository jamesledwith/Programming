package com.jamesl;

public class BMW extends Car {
    private int roadSetviceMonths;

    public BMW(int roadSetviceMonths) {
        super("BMW", "black", 5, 5, 6, false, 0);
        this.roadSetviceMonths = roadSetviceMonths;
    }

    public void accelerate(int rate){
        int newVelocity = getSpeed() + rate;

        if (newVelocity == 0){
            stop(0);
        }
        else if (newVelocity > 0){

        }
    }

}
