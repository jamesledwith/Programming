package com.jamesl;

public class Motherboard {
    private String model;
    private String manufacturer;
    private String bios;
    private int ramSlots;
    private int cardBlots;

    public Motherboard(String model, String manufacturer, String bios, int ramSlots, int cardBlots) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.bios = bios;
        this.ramSlots = ramSlots;
        this.cardBlots = cardBlots;
    }

    public void loadProgram(String programName)   {
        System.out.println("Program " + programName + " is now loading...");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getBios() {
        return bios;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardBlots() {
        return cardBlots;
    }
}
