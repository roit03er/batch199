package com.Spring;

public class CargoPlane implements Plane {

    private String model;
    private int range;
    private Engine engine;

    public CargoPlane() {
    	
    }

    public CargoPlane(String model, int range) {
        this.model = model;
        this.range = range;
    }

    // Getter and Setter for model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Getter and Setter for range
    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    // ✅ Add Getter and Setter for engine
    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void takeOff() {
        System.out.println("CargoPlane is taking off...");
    }

    @Override
    public void fly() {
        System.out.println("CargoPlane is flying low...");
    }

    @Override
    public void land() {
        System.out.println("CargoPlane is landing...");
    }

    @Override
    public String toString() {
        return "CargoPlane [Model=" + model + ", Range=" + range + ", Engine=" + engine + "]";
    }
}
