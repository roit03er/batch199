package com.Spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "tpe")
public class TurboPropEngine extends Engine {
	
	@Value("General")
	private String company;
	@Override
	public String toString() {
		return "TurboPropEngine: ["+ company +"]";
	}
}
