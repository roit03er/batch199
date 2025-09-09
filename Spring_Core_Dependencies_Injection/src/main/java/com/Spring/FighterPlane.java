package com.Spring;

public class FighterPlane implements Plane{

	
	private String model;
	private int range;
	private Engine engine;
	
	
	public FighterPlane() {
	}

	

	public FighterPlane(String model, int range, Engine engine) {
		super();
		this.model = model;
		this.range = range;
		this.engine = engine;
	}



	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}
	

	public Engine getEngine() {
		return engine;
	}



	public void setEngine(Engine engine) {
		this.engine = engine;
	}



	@Override
	public void takeOff() {
			System.out.println("FighterPlane is TakeOff..");
	}

	@Override
	public void fly() {
		System.out.println("FighterPlane is Flying High...");
	}

	@Override
	public void land() {
		System.out.println("FighterPlane is Landing...");
	}
	@Override
	public String toString() {
		return "FighterPlane: ["+model+", "+range+", "+engine+" ]";
	}

}
