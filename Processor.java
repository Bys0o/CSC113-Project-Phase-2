package CSCProj;

import java.io.*;

public class Processor implements Serializable{
	
	private String brand;
	private String model;
	public Processor(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}
	public void displayProcessor() {
		System.out.println("Processor: " + brand + " | Model: " + model);
	}
}