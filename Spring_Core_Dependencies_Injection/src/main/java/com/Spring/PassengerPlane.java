package com.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "pp")
public class PassengerPlane implements Plane{
	
	private String model;
	private int range;
    private Engine engine;

	
	public Engine getEngine() {
		return engine;
	}
	
	@Autowired
	public void setEngine(@Qualifier("tpe") Engine engine) {
		this.engine = engine;
	}

	public PassengerPlane() {
		super();
	}

	
	
	public PassengerPlane( String model, int range,  Engine engine) {
		super();
		this.model = model;
		this.range = range;
		this.engine = engine;
	}

	public String getModel() {
		return model;
	}
	@Autowired
	public void setModel(@Value("Z-133 Falcon")  String model) {
		this.model = model;
	}

	public int getRange() {
		return range;
	}
	
	@Autowired
	public void setRange(@Value("98000")int range) {
		this.range = range;
	}

	@Override
	public void takeOff() {
			System.out.println("PassengerPlane is TakeOff..");
	}

	@Override
	public void fly() {
		System.out.println("PassengerPlane is Flying low...");
	}

	@Override
	public void land() {
		System.out.println("PassengerPlane is Landing...");
	}
	 @Override
	    public String toString() {
	        return "PassengerPlane [Model=" + model + ", Range=" + range + ", Engine=" + engine + "]";
	    }
}
