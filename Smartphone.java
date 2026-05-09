package CSCProj;

import java.io.*;

public class Smartphone extends Electronics implements Serializable{
	
	private int batteryCapacity;
    private String os;

    public Smartphone(int id, String name, double price, String brand, int warrantyMonths, int batteryCapacity, String os) {
        super(id, name, price, brand, warrantyMonths);
        this.batteryCapacity = batteryCapacity;
        this.os = os;
    }

    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery: " + batteryCapacity + " mAh");
        System.out.println("OS: " + os);
    }
}