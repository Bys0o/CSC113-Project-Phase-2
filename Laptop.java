package CSCProj;

import java.io.*;

public class Laptop extends Electronics implements Serializable{
	
	private int ramsize;
    private Processor cpu;

    public Laptop(int id, String name, double price, String brand, int warrantyMonths, int ramsize, String processorType) {
        super(id, name, price, brand, warrantyMonths);
        this.ramsize = ramsize;
        this.cpu = new Processor("Intel", processorType);
    }

    public int getRamsize() {
        return ramsize;
    }

    public void setRamsize(int ramsize) {
        this.ramsize = ramsize;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("RAM Size: " + getRamsize() + "GB");
        cpu.displayProcessor(); 
    }
}
